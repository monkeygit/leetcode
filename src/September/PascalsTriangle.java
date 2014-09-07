package September;
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	
	public List<List<Integer>> generate(int numRows){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(numRows == 0) return res;
		List<Integer> row1 = new ArrayList<Integer>();
		List<Integer> row2 = new ArrayList<Integer>();
		row1.add(1);
		res.add(row1);
		if(numRows == 1) return res;
		row2.add(1);
		row2.add(1);
		res.add(row2);
		if(numRows == 2) return res;
		List<Integer> rowi = row2;
		for(int i=2; i<numRows; i++){
			List<Integer> newRow = new ArrayList<Integer>();
			newRow.add(1);
			int p = 1, q = 2;
			while(p <= i && q <= i){
				newRow.add(rowi.get(p-1) + rowi.get(q-1));
				p++;
				q++;
			}
			newRow.add(1);
			rowi = newRow;
			res.add(newRow);
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalsTriangle test = new PascalsTriangle();
		List<List<Integer>> r = test.generate(5);
		System.out.println(r.toString());
	}

}

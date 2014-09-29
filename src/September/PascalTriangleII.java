package September;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
	
	public List<Integer> getRow(int rowIndex){
		List<Integer> res = new ArrayList<Integer>();
		res.add(1);
		if(rowIndex == 0) return res;
		int[] rowOld = new int[rowIndex+1];
		rowOld[0] = 1;
		for(int i=0; i<rowIndex; i++){
			int[] rowNew = new int[rowIndex+1];
			rowNew[0] = 1;
			for(int j=1; j<=rowIndex; j++)
				rowNew[j] = rowOld[j-1] + rowOld[j];
			rowOld = rowNew;
		}
		for(int i=1; i<rowOld.length; i++)
			res.add(rowOld[i]);
		return res;
	}
	
	public static void main(String[] args) {
		PascalTriangleII test = new PascalTriangleII();
		System.out.println(test.getRow(0).toString());
		System.out.println(test.getRow(1).toString());
		System.out.println(test.getRow(2).toString());
		System.out.println(test.getRow(3).toString());
		System.out.println(test.getRow(4).toString());
		System.out.println(test.getRow(5).toString());
		System.out.println(test.getRow(6).toString());

	}

}

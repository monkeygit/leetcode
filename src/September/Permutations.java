package September;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	
	private List<List<Integer>> res = new ArrayList<List<Integer>>();
	
	public List<List<Integer>> permute(int[] num){
		perm(num, 0);
		return res;
	}
	
	private void perm(int[] num, int begin){
		if(begin == num.length-1)
		{
			List<Integer> r = new ArrayList<Integer>();
			for(int i=0; i<num.length; i++)
				r.add(num[i]);
			res.add(r);
		}
		else{
			for(int i=begin; i<num.length; i++){
				int tmp = num[i];
				num[i] = num[begin];
				num[begin] = tmp;
				
				perm(num, begin+1);
				
				tmp = num[i];
				num[i] = num[begin];
				num[begin] = tmp;	
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permutations test = new Permutations();
		int[] array = {};
		List<List<Integer>> haha = test.permute(array);
		for(int i=0; i<haha.size(); i++)
			System.out.println(haha.get(i).toString());
	}

}

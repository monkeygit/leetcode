package September;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	
	public List<List<Integer>> combine(int n, int k){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(n == 0) return res;
		boolean flag = false;
		int[] A = new int[n];
		for(int i=0; i<n; i++)
			if(i < k)
				A[i] = 1;
			else A[i] = 0;
		res.add(generateList(A));
		if(n != k)
			do{
				int pose = 0;
				int sum = 0;
				for(int i=0; i<n-1; i++)
					if(A[i] == 1 && A[i+1] == 0){
						A[i] = 0;
						A[i+1] = 1;
						pose = i;
						break;
					}
				
				for(int i=0; i<pose; i++)
					if(A[i] == 1)
						sum++;
	
				for(int i=0; i<pose; i++)
					if(i < sum)
						A[i] = 1;
					else
						A[i] = 0;
				res.add(generateList(A));
				flag = false;
				for(int i=n-k; i<n; i++)
					if(A[i] == 0)
						flag = true;
				
				
			}while(flag);
		
		return res;
	}
	
	private List<Integer> generateList(int[] a){
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++)
			if(a[i] == 1)
				list.add(i+1);
		return list;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combinations test = new Combinations();
		List<List<Integer>> l = test.combine(4,2);
		for(int i=0; i<l.size(); i++)
			System.out.println(l.get(i).toString());
	}

}

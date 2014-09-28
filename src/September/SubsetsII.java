package September;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
	private List<List<Integer>> res = new ArrayList<List<Integer>>();
	
    public List<List<Integer>> subsetsWithDup(int[] S) {
        boolean[] ax = new boolean[S.length];
        Arrays.sort(S);
        sub(0, S.length, S, ax);
        return res;
    }
    
    private void sub(int i, int n, int[] S, boolean[] ax){
    	if(i >= n){
    		List<Integer> l = new ArrayList<Integer>();
    		for(int j=0; j<ax.length; j++)
    			if(ax[j])
    				l.add(S[j]);
    		if(!res.contains(l))
    			res.add(l);
    	}
    	else{
    		ax[i] = true;
    		sub(i+1, n, S, ax);
    		ax[i] = false;
    		sub(i+1, n, S, ax);
    	}
    }
	
	public static void main(String[] args) {
		SubsetsII test = new SubsetsII();
		int[] a = {1,2,2};
		System.out.println(test.subsetsWithDup(a).toString());
	}
}

package September;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParentheses {
	
	public List<String> generateParenthesis(int n){
		List<String> res = new ArrayList<String>();
		Set<String> r = new HashSet<String>();
		r = func(n);
		res.addAll(r);
		return res;
	}
	
	private Set<String> func(int n){
		Set<String> res = new HashSet<String>();
		if(n == 0) return res;
		if(n == 1){
			res.add("()");
			return res;
		}
		for(int i=1; i<=n/2; i++){
			List<String> r1 = generateParenthesis(n-i);
			List<String> r2 = generateParenthesis(i);
			for(int j=0; j<r1.size(); j++)
				for(int k=0; k<r2.size(); k++){
					res.add(r1.get(j)+r2.get(k));
					res.add(r2.get(k)+r1.get(j));
					
				}
			if( i == 1)
				for(int l=0; l<r1.size(); l++)
					res.add("("+r1.get(l)+")");
		}
		
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateParentheses test = new GenerateParentheses();
		System.out.println(test.generateParenthesis(4).toString());
	}

}

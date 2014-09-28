package test;

import java.util.HashSet;

public class RemoveDuplicates {
	
	
	public String remove(String s){
		String res = "";
		HashSet hs = new HashSet<Character>();
		for(int i=0; i<s.length(); i++)
			if(!hs.contains(s.charAt(i))){
				res += s.charAt(i);
				hs.add(s.charAt(i));
			}
		return res;
	}
	
	public static void main(String[] args) {
		RemoveDuplicates test = new RemoveDuplicates();
		System.out.println(test.remove(""));
	}

}

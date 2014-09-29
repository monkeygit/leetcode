package test;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Today is a nice day";
		String[] res = null;
		res = s.split(" ");
		for(int i=0; i<res.length; i++){
			System.out.println("["+res[i]+"]");
			System.out.println(res[i] == null);
			System.out.println(res[i].length());
		}
		System.out.println(res.length);
		
	}

}

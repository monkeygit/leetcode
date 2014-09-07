package test;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	
	public static void fuc(int[] n){
		n[0] = 100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {1};
		Test.fuc(n);
		System.out.println(n[0]);
	}

}

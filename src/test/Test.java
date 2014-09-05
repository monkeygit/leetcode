package test;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> rtoi = new HashMap<Character, Integer>();
		rtoi.put('I', 1);
		rtoi.put('V', 5);
		rtoi.put('X', 10);
		rtoi.put('L', 50);
		rtoi.put('C', 100);
		rtoi.put('D', 500);
		rtoi.put('M', 1000);
		String s = "IVXLCDM";
		System.out.println(s.substring(0, 1));
		System.out.println(rtoi.get(s.substring(0, 1)));
	}

}

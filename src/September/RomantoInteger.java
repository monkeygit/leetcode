package September;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
	
	public int romanToInt(String s){
		Map<String, Integer> rtoi = new HashMap<String, Integer>();
		rtoi.put("I", 1);
		rtoi.put("V", 5);
		rtoi.put("X", 10);
		rtoi.put("L", 50);
		rtoi.put("C", 100);
		rtoi.put("D", 500);
		rtoi.put("M", 1000);
		String comp = "IVXLCDM";
		int res = 0;
		for(int i=0; i<s.length(); i++){
			if(i < s.length()-1 && comp.indexOf(s.substring(i, i+1)) < comp.indexOf(s.substring(i+1, i+2))){
				res += rtoi.get(s.substring(i+1, i+2)) - rtoi.get(s.substring(i, i+1));
				i++;
			}
			else
				res += rtoi.get(s.substring(i, i+1));
		}

		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomantoInteger test = new RomantoInteger();
		System.out.println(test.romanToInt("I"));
		System.out.println(test.romanToInt("III"));
		System.out.println(test.romanToInt("IV"));
		System.out.println(test.romanToInt("VIII"));
		System.out.println(test.romanToInt("MCMLXXXIV"));
		System.out.println(test.romanToInt("MMMCMXCIX"));
	}

}

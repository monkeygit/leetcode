package September;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	
	public List<Integer> grayCode(int n){
		List<Integer> res = new ArrayList<Integer>();
		if(n == 0){
			res.add(0);
		}
		else{
			String[] r = generate(n);
			for(int i=0; i<r.length; i++){
				res.add(Integer.parseInt(r[i], 2));
			}
		}
		return res;
	}
	
	private String[] generate(int n){
		String[] graycode = new String[(int) Math.pow(2, n)];  
		  
	    if (n == 1) {  
	        graycode[0] = "0";  
	        graycode[1] = "1";  
	        return graycode;  
	    }  
	  
	    String[] last = generate(n - 1);  
	  
	    for (int i = 0; i < last.length; i++) {  
	        graycode[i] = "0" + last[i];  
	        graycode[graycode.length - 1 - i] = "1" + last[i];  
	    }  
	  
	    return graycode;  
	}
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrayCode test = new GrayCode();
		List<Integer> r = test.grayCode(0);
		for(int i=0; i<r.size(); i++)
			System.out.print(r.get(i) + " ");
	}

}

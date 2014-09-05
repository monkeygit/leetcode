package September;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	
	public List<Integer> grayCode(int n){
		List<Integer> gc = new ArrayList<Integer>((int)Math.pow(2, n));
		
		if(n == 1){
			gc.add(0);
			gc.add(1);
			return gc;
		}
		
		List<Integer> last = grayCode(n - 1);
		
		for(int i=0; i<last.size(); i++){
			int[] gci = gc.t;
			
		}
	}
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package September;

public class SingleNumberII {
	
	public int singleNumber(int[] A){
	    int ones = 0, twos = 0;
	    /*
	     * First time -> save in ones
	     * Second time -> save in twos and clear ones
	     * Third time -> clear ones and twos
	     * Awesome!!!
	     */
	    for(int i = 0; i < A.length; i++){
	        ones = (ones ^ A[i]) & ~twos;
	        twos = (twos ^ A[i]) & ~ones;
	    }
	    return ones;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleNumberII sn = new SingleNumberII();
		int[] b = new int[]{1,1,1,2,2,2,9,-2147483605,-2147483605,-2147483605};
		System.out.println(sn.singleNumber(b));
	}

}

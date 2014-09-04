package September;


public class SingleNumber {
	
	public int singleNumber(int A[]){
		int r = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<A.length; i++){
			if(A[i] > max)
				max = A[i];
			if(A[i] < min)
				min = A[i];
		}
		
		boolean[] appearance = new boolean[max - min + 1];

		for(int i=0; i<A.length; i++)
			appearance[A[i] - min] = !appearance[A[i] - min];
		
		for(int i=0; i<appearance.length; i++)
			if(appearance[i])
				r = i + min;
		return r;
	}
	
	public int singleNumberV2(int A[]){
		int result = A[0];
		for(int i=1; i<A.length; i++)
			result = result ^ A[i]; //XOR满足交换律和结合律，又有A^B^A=B,A^A=0,A^0=A
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleNumber sn = new SingleNumber();
		int[] b = new int[]{1,1,8,2,2};
		System.out.println(sn.singleNumberV2(b));
	}

}

package September;

public class MaxmiumSubarray {
	
	public int maxSubArray(int[] A){
		int max = 0;
		int curMax = 0;
		boolean hasPositive = false;
		for(int i=0; i<A.length; i++){
			if(A[i] >= 0)
				hasPositive = true;
			curMax += A[i];
			if(curMax > max)
				max = curMax;
			if(curMax < 0)
				curMax = 0;
		}
		if(!hasPositive){
			max = Integer.MIN_VALUE;
			for(int i=0; i<A.length; i++)
				if(A[i] > max)
					max = A[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxmiumSubarray test = new MaxmiumSubarray();
		int[] t1 = {-2,1,-3,4,-1,2,1,-5,4};
		int[] t2 = {-1,-1,-1};
		System.out.println(test.maxSubArray(t1));
		System.out.println(test.maxSubArray(t2));
	}

}

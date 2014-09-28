package test;

public class MaxIncrementSubarray {
	
	public int maxSub(int[] num){
		if(num.length == 0) return 0;
		int max = 1;
		int cur_max = 1;
		for(int i=0; i<num.length-1; i++){
			if(num[i] <= num[i+1]){
				cur_max++;
				if(cur_max > max)
					max = cur_max;
			}
			else
				cur_max = 1;
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] a = {5,4,3,3,4,3};
		MaxIncrementSubarray test = new MaxIncrementSubarray();
		System.out.println(test.maxSub(a));
	}

}

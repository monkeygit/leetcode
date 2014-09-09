package September;

public class BestTimetoBuyandSell {
	
	public int maxProfit(int[] prices){
		if(prices.length == 0) return 0;
		int[] div = new int[prices.length-1];
		for(int i=0; i<div.length; i++)
			div[i] = prices[i+1] - prices[i];
		
		return maxSubArray(div);
		
	}
	
	public int maxSubArray(int[] A){
		int max = 0;
		int curMax = 0;
		for(int i=0; i<A.length; i++){
			curMax += A[i];
			if(curMax > max)
				max = curMax;
			if(curMax < 0)
				curMax = 0;
		}

		return max;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t = {1,2,3,4,5};
		BestTimetoBuyandSell test = new BestTimetoBuyandSell();
		System.out.println(test.maxProfit(t));
	}

}

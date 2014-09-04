package September;

public class BestTimetoBuyandSell2 {
	
	public int maxProfit(int[] prices){
		int profit = 0;
		for(int i=0; i<prices.length-1; i++){
			if(prices[i] < prices[i+1])
				profit += prices[i+1] - prices[i];
		}
		return profit;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BestTimetoBuyandSell2 bb = new BestTimetoBuyandSell2();
		int[] p = new int[]{1,1,1,1};
		System.out.println(bb.maxProfit(p));
	}

}

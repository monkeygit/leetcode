package September;

public class MinimumPathSum {
	
	public int minPathSum(int[][] grid){
		
	}
	
	public int minSubPathSum(int[][] grid, int m, int n, int sum){
		if(m == grid.length && n == grid.length-1)
			return sum + grid[m][n];
		else
			return Math.min(minSubPathSum(grid, m+1, n, sum+grid[m][n]), minSubPathSum(grid, m+1, n, sum+grid[m][n]));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1,2,3,4}};
		MinimumPathSum test = new MinimumPathSum();
		System.out.println(test.minPathSum(grid));
	}

}

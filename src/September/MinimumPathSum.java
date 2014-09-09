package September;

public class MinimumPathSum {
	
	public int minPathSum(int[][] grid){
		if(grid == null || grid.length == 0) return 0;
		int m = grid.length;
		int n = grid[0].length;
		int[][] dist = new int[m][n];
		
		for(int i=0; i<m; i++)
			for(int j=0; j<n; j++){
				if(i == 0 && j == 0)
					dist[0][0] = grid[0][0];
				else 
					dist[i][j] = Math.min(getDist(dist, i-1, j), getDist(dist, i, j-1)) + grid[i][j];
			}
		
		return dist[m-1][n-1];
	}
	
	private int getDist(int[][] dist, int x, int y){
		if(x < 0 || y < 0)
			return Integer.MAX_VALUE;
		return dist[x][y];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] t = {{1},{1},{1}};
		MinimumPathSum test = new MinimumPathSum();
		System.out.println(test.minPathSum(t));
	}

}

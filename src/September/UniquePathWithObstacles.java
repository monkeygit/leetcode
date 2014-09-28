package September;

public class UniquePathWithObstacles {
	
	public int uniquePathWithObstacles(int[][] obstacleGrid){
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		if(obstacleGrid[0][0] == 1) return 0;
		int res = uniquePaths(m, n);
		
		for(int i=0; i<m; i++)
			for(int j=0; j<n; j++)
				if(obstacleGrid[i][j] == 1)
					
			
	}
	
	private int uniquePaths(int m, int n){
		int N = m + n - 2;
		int k = m - 1;
		double res = 1;
		for(int i=1; i<=k; i++)
			res = res * (N - k + i)/i;
		return (int) res;
	}
	
	public static void main(String[] args) {

	}

}

package September;


public class UniquePaths {
	
	/*how to calculate Cnm*/
	public int uniquePaths(int m, int n){
		int N = m + n - 2;
		int k = m - 1;
		double res = 1;
		for(int i=1; i<=k; i++)
			res = res * (N - k + i)/i;
		return (int) res;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniquePaths test = new UniquePaths();
		System.out.println(test.uniquePaths(20, 20));

	}

}

package September;

public class ClimbingStairs {
	
	public int climbStairs(int n){
		int a = 1;
		int b = 1;
		int res = 1;
		if(n >= 2){
			for(int i=1; i<=n-1; i++){
				res = a + b;
				b = a;
				a = res;
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClimbingStairs test = new ClimbingStairs();
		System.out.println(test.climbStairs(0));
		System.out.println(test.climbStairs(1));
		System.out.println(test.climbStairs(2));
		System.out.println(test.climbStairs(3));
		System.out.println(test.climbStairs(4));
		System.out.println(test.climbStairs(5));
	}

}

package September;

public class UniqueBinarySearchTrees {

	public int numTrees(int n){
		if(n == 0 || n == 1) return 1;
		int res = 0;
		for(int i=1; i<=n; i++)
			res += numTrees(i-1) * numTrees(n-i);
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueBinarySearchTrees test = new UniqueBinarySearchTrees();
		System.out.println(test.numTrees(1));
		System.out.println(test.numTrees(2));
		System.out.println(test.numTrees(3));
		System.out.println(test.numTrees(4));
		System.out.println(test.numTrees(5));
		System.out.println(test.numTrees(0));
		
	}

}

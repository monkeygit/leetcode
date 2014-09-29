package September;

public class SumRoottoLeafNumbers {
	private int sum = 0;
	
	public int sumNumbers(TreeNode root){
		if(root != null)
			sumPath(root, 0);
		return sum;
	}
	
	private void sumPath(TreeNode root, int curSum){
		curSum += root.val;
		if(root.left == null && root.right == null)
			sum += curSum;
		if(root.left != null)
			sumPath(root.left, curSum*10);
		if(root.right != null)
			sumPath(root.right, curSum*10);
	}
	
}

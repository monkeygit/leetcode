package September;

public class PathSum {
	
	private boolean isRoot = true;
	
	public boolean hasPathSum(TreeNode root, int sum){
		if(isRoot && root == null && sum == 0){ 
			isRoot = false;
			return false;
		}
		if(root == null && sum == 0) return true;
		else if(root == null && sum != 0) return false;
		else
			return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
		
	}
}

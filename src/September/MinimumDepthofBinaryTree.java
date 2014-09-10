package September;

public class MinimumDepthofBinaryTree {
	
	
	public int minDepth(TreeNode root){
		if(root == null) return 0;
		return minDepthRecur(root, 1);
	}
	
	public int minDepthRecur(TreeNode root, int curDepth){
		if(root.left == null && root.right == null)
			return curDepth;
		else if(root.left != null && root.right == null)
				return minDepthRecur(root.left, curDepth+1);
		else if(root.right != null && root.left == null)
				return minDepthRecur(root.right, curDepth+1);
		else
			return Math.min(minDepthRecur(root.left, curDepth+1), minDepthRecur(root.right, curDepth+1));
	}
}

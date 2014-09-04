package September;

public class MaximumDepthofBinaryTree {
	

	
	public int maxDepth(TreeNode root){
		if(root == null)
			return 0;
		int dl = maxDepth(root.left);
		int dr = maxDepth(root.right);
		return 1 + ( dl > dr ? dl : dr );
	}
	
	/*Awesome code from leetcode*/
	public int maxDepthV2(TreeNode root){
		return root != null ? 1 + Math.max(maxDepthV2(root.left), maxDepthV2(root.right)) : 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}




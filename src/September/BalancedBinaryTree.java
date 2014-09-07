package September;

public class BalancedBinaryTree {
	
	public boolean isBalanced(TreeNode root){
		Depth depth = new Depth();
		return isBalanced(root, depth);
	}
	
	private boolean isBalanced(TreeNode root, Depth d){
		if(root == null){
			d.height = 0;
			return true;
		}
		
		Depth left = new Depth();
		Depth right = new Depth();
		if(isBalanced(root.left, left) && isBalanced(root.right, right)){
			int diff = left.height - right.height;
			if(diff <= 1 && diff >= -1){
				d.height = 1 + (left.height > right.height ? left.height : right.height);
				return true;
			}
		}
		
		return false;
	}
	
	private class Depth{
		public int height;
		public int left;
		public int right;
	}
}

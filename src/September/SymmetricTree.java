package September;

public class SymmetricTree {
	
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return twoNode(root.left, root.right);
        
    }
    
    private boolean twoNode(TreeNode left, TreeNode right){
    	if(left == null && right == null) return true;
    	else if(left != null && right != null && left.val == right.val)
    		return twoNode(left.left, right.right) && twoNode(left.right, right.left);
    	else return false;	
    }
}

package September;

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q){
		if(p == null && q == null)
			return true;
		else if(p == null && q != null || p != null && q == null)
			return false;
		return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
	
	/*Awesome code from leetcode*/
	public boolean isSameTreeV2(TreeNode p, TreeNode q){
		if(p == null || q == null)
			return p == q;
		else return (p.val == q.val) && isSameTreeV2(p.left, q.left) && isSameTreeV2(p.right, q.right);
	}
}

package September;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
	
	public List<Integer> postorderTraversal(TreeNode root){
		List<Integer> res = new ArrayList<Integer>();
		postOrder(root, res);
		return res;
	}
	
	public void postOrder(TreeNode root, List<Integer> l){
		if(root != null){
			postOrder(root.left, l);
			postOrder(root.right, l);
			l.add(root.val);
		}
	}
	
}

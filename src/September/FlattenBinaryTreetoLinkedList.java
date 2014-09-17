package September;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class FlattenBinaryTreetoLinkedList {
	
	public void flatten(TreeNode root){
		TreeNode p = root;
		List<TreeNode> l = preorderTraversal(root);
		if(p != null){
			p.left = null;
			for(int i=0; i<l.size(); i++){
				p.right = l.get(i);
				p = p.right;
			}
		}
	}
	
	private List<TreeNode> preorderTraversal(TreeNode root){
		List<TreeNode> res = new LinkedList<TreeNode>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode p = root;
		while(p != null || !stack.isEmpty()){
			while(p != null){
				res.add(p);
				stack.push(p);
				p = p.left;
			}
			if(!stack.isEmpty()){
				p = stack.pop();
				p = p.right;
			}
		}
		
		return res;
	}
	
}

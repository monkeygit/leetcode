package September;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
	
	public List<List<Integer>> levelOrder(TreeNode root){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		if(root == null)
			return res;
		
		List<Integer> levelRoot = new ArrayList<Integer>();
        levelRoot.add(root.val);
        res.add(levelRoot);
        
        ArrayList<TreeNode> tmp = new ArrayList<TreeNode>();
        tmp.add(root);
		int current = 0;
		int last = 1;
		while(current < tmp.size()){
			
			last = tmp.size();
			List<Integer> eachLevel = new ArrayList<Integer>();
			
			while(current < last){
				
				if(tmp.get(current).left != null){
					tmp.add(tmp.get(current).left);
					eachLevel.add(tmp.get(current).left.val);
				}
				if(tmp.get(current).right != null){
					tmp.add(tmp.get(current).right);
					eachLevel.add(tmp.get(current).right.val);
				}
				
				current++;
			}
			
			if(eachLevel.size() > 0)
				res.add(eachLevel);
		}
		
		return res;
	}
	
}

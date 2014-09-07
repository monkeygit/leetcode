package September;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
	
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<List<Integer>> resReverse = new ArrayList<List<Integer>>();
        if(root == null) return res;
        
         List<Integer> levelRoot = new ArrayList<Integer>();
         levelRoot.add(root.val);
         res.add(levelRoot);
         
        int current = 0;
        int last = 1;
        List<TreeNode> tmp = new ArrayList<TreeNode>();
        tmp.add(root);
        while(current < tmp.size()){
        	
        	last = tmp.size();
        	List<Integer> eachLevel = new ArrayList<Integer>();
        	
        	while(current < last){
        		if(tmp.get(current).left != null){
        			eachLevel.add(tmp.get(current).left.val);
        			tmp.add(tmp.get(current).left);
        		}
        		if(tmp.get(current).right != null){
        			eachLevel.add(tmp.get(current).right.val);
        			tmp.add(tmp.get(current).right);
        		}
        		current++;
        	}
        	if(eachLevel.size() > 0)
        		res.add(eachLevel);
        	
        }
        
        for(int i=res.size()-1; i>=0; i--)
        	resReverse.add(res.get(i));
        
        return resReverse;
        	
    }
	
}

package September;

import java.util.ArrayList;
import java.util.Stack;

public class PopulatingNextRightPointersinEachNode {
	
	public void connect(TreeLinkNode root){
		ArrayList<TreeLinkNode> al = new ArrayList<TreeLinkNode>();
		if(root != null)
			al.add(root);
		else return;
		int current = 0;
		int last = 1;
		while(current < al.size()){
			last = al.size();
			
			while(current < last){
				if(al.get(current).left != null){
					if((current & (current + 1)) != 0)
						al.get(al.size()-1).next = al.get(current).left;
					al.get(current).left.next = al.get(current).right;
					al.add(al.get(current).left);
					al.add(al.get(current).right);
				}
				
				current++;
			}
		}
	}
	
}

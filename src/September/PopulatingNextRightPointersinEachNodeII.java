package September;

import java.util.ArrayList;

public class PopulatingNextRightPointersinEachNodeII {
	public void connect(TreeLinkNode root){
		ArrayList<TreeLinkNode> al = new ArrayList<TreeLinkNode>();
		if(root != null)
			al.add(root);
		else return;
		int current = 0;
		int last = 1;
		while(current < al.size()){
			last = al.size();
			boolean isNewLevel = true;
			while(current < last){
				if(al.get(current).left != null){
					if(!isNewLevel)
						al.get(al.size()-1).next = al.get(current).left;
					al.add(al.get(current).left);
					isNewLevel = false;
				}
				if(al.get(current).right != null){
					if(!isNewLevel)
						al.get(al.size()-1).next = al.get(current).right;
					al.add(al.get(current).right);
					isNewLevel = false;
				}
				
				current++;
			}
		}
	}
}

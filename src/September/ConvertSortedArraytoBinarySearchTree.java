package September;

public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] num) {
        if(num.length == 0)
        	return null;
        
        TreeNode head = helper(num, 0, num.length-1);
        return head;
    }
    
    public TreeNode helper(int[] num, int low, int high){
    	if(low > high)
    		return null;
    	int mid = (low + high)/2;
    	TreeNode newNode = new TreeNode(num[mid]);
    	newNode.left = helper(num, low, mid-1);
    	newNode.right = helper(num, mid+1, high);
    	return newNode;
    }
    
}

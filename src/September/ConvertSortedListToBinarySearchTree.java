package September;

public class ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        int count = 0;
        ListNode p = head;
        while(p != null){
        	count++;
        	p = p.next;
        }
        
        p = head;
        int[] num = new int[count];
        
    	if(num.length == 0)
        	return null;
    	
        for(int i=0; i<count; i++){
        	num[i] = p.val;
        	p = p.next;
        }
    
        TreeNode tHead = helper(num, 0, num.length-1);
        return tHead;
    }
    
    private TreeNode helper(int[] num, int low, int high){
    	if(low > high)
    		return null;
    	int mid = (low + high)/2;
    	TreeNode newNode = new TreeNode(num[mid]);
    	newNode.left = helper(num, low, mid-1);
    	newNode.right = helper(num, mid+1, high);
    	return newNode;
    }
}



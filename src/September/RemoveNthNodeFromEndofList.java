package September;

public class RemoveNthNodeFromEndofList {
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	int length = 0;
    	ListNode p = head;
    	if(n == 0) return head;
        while(p != null){
        	p = p.next;
        	length++;
        }
        p = head;
        if(n == length) return p.next;
        else{
        	for(int i=0; i<length-n-1; i++)
        		p = p.next;
        	p.next = p.next.next;
        }
        return head;
    }
    
    public ListNode create(int[] A){
    	ListNode head = new ListNode(A[0]);
    	ListNode p = head;
    	for(int i=1; i<A.length; i++){
    		ListNode newNode = new ListNode(A[i]);
    		p.next = newNode;
    		p = newNode;
    	}
    	return head;
    }
    
    public void print(ListNode head){
    	ListNode p = head;
    	while(p != null){
    		System.out.print(p.val+" ");
    		p = p.next;
    	}
    	System.out.println();
    }
    
    public static void main(String[] args){
    	RemoveNthNodeFromEndofList test = new RemoveNthNodeFromEndofList();
    	int[] A = {};
    	ListNode t = test.removeNthFromEnd(test.create(A), 0);
    	test.print(t);
    	
    }
}

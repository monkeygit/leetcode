package September;

public class LinkedListCycle {
	
	public boolean hasCycle(ListNode head){
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) break;
		}
		return !(fast == null || fast.next == null);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

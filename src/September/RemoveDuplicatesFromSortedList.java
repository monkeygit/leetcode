package September;

public class RemoveDuplicatesFromSortedList {
	
	public ListNode deleteDuplicates(ListNode head){
		ListNode h = head;
		if(h != null && h.next != null){
			ListNode p = head;
			while(p != null){
				while(p.next != null && p.next.val == p.val)
					p.next = p.next.next;
				p = p.next;
			}
		}
		return h;
	}
	
}

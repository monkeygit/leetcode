package September;

public class SwapNodesinPairs {
	
	public ListNode swapPairs(ListNode head){
		ListNode p = head;
		if(p == null || p.next == null) return p;
		ListNode q = p.next;
		p.next = q;
		q.next = p;
		if(p.next == null) return q;
		q = p.next;
		ListNode r = q.next;
		while(r != null){
			p.next = r;
			q.next = r.next;
			r.next = q;
			p = 
		}
	}
	
}

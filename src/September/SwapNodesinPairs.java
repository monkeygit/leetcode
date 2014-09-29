package September;

public class SwapNodesinPairs {
	
	public ListNode swapPairs(ListNode head){
		ListNode newHead = null;
		ListNode p = head;
		
		/*empty list or only one node*/
		if(p == null || p.next == null) return p;
		
		/*two nodes*/
		ListNode q = p.next;
		p.next = q.next;
		q.next = p;
		if(p.next == null) return q;
		
		/*not less than three nodes*/
		newHead = q;
		q = p.next;
		ListNode r = q.next;
		while(r != null){
			
			/*swap*/
			p.next = r;
			q.next = r.next;
			r.next = q;
			
			/*move pointer*/
			p = q;
			q = p.next;
			if(q != null)
				r = q.next;
			else break;
		}
		
		return newHead;
	}
	
	public static void main(String[] args){
		SwapNodesinPairs test = new SwapNodesinPairs();
		ListNode head = new ListNode(0);
		ListNode p = head;
		for(int i=0; i<1; i++){
			ListNode tmp = new ListNode(i+1);
			p.next = tmp;
			p = p.next;
		}
		
		p = head;
		while(p != null){
			System.out.print(p.val+" ");
			p = p.next;
		}
		System.out.println();
		ListNode newList = test.swapPairs(head);
		p = newList;
		while(p != null){
			System.out.print(p.val+" ");
			p = p.next;
		}
	}
	
}

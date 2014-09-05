package September;

public class MergeTwoSortedLists {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null && l2 == null) return null;
		if(l1 != null && l2 == null) return l1;
		if(l1 == null && l2 != null) return l2;
		ListNode p = l1;
		ListNode q = l2;
		ListNode newList = l1.val < l2.val ? l1 : l2;
		ListNode n = newList;
		if(p.val < q.val)
			p = p.next;
		else
			q = q.next;
		while(p != null && q != null){
			if(p.val < q.val){
				n.next = p;
				p = p.next;
			}
			else{
				n.next = q;
				q = q.next;
			}
			n = n.next;
		}
		if(p == null){
			while(q != null){
				n.next = q;
				n = n.next;
				q = q.next;
			}
		}
		if(q == null){
			while(p != null){
				n.next = p;
				n = n.next;
				p = p.next;
			}
		}
		
		return newList;
	}
	
}

package cn.zp.leetcode;
import cn.zp.leetcode.ListNode;
public class RemoveNthNode {

	/**
	 * @param args
	 */
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p=head;
        ListNode q=head;
        ListNode pre=head;
        for(int i=0; i<n-1; i++){
        	q=q.next;
        }
        if(head.next == null && n==1)
        	return null;
        if(q.next == null)
        	return head.next;
        while(q.next != null){
        	pre = p;
        	p=p.next;
        	q=q.next;
        }
        pre.next = p.next;
        
        
        return head;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a =new ListNode(2);
		ListNode b =new ListNode(4);
		ListNode c =new ListNode(3);
		ListNode cc =new ListNode(5);
		ListNode bb =new ListNode(7);
		ListNode aa =new ListNode(8);
		a.next = b;b.next=c;c.next=cc;cc.next=bb;bb.next=aa;
		ListNode re=removeNthFromEnd(a,2);
		while(re != null){
			System.out.println(re.val);
			re = re.next;
		
	}

}
}

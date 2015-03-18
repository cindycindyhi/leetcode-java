package cn.zp.leetcode;
//Definition for singly-linked list.

public class AddTwoSum {

	/**
	 * @param args
	 */
	
	
	 
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode origin = result;
        int tag =0;
        while(l1!=null || l2!=null){
        	int num1 =0,num2 = 0;
        	if(l1 != null)
        		num1 = l1.val;
        	if(l2 != null)
        		num2 = l2.val;
        	result.next = new ListNode((num1+num2+tag)%10);
        	tag =(num1+num2+tag)/10;
        	if(l1 != null)
        		l1=l1.next;
        	if(l2 != null)
        		l2=l2.next;
        	result = result.next;
        }
        if(tag != 0)
        	result.next = new ListNode(tag);
        return origin.next;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode a =new ListNode(2);
//		ListNode b =new ListNode(4);
//		ListNode c =new ListNode(3);
//		ListNode cc =new ListNode(3);
//		ListNode bb =new ListNode(3);
//		ListNode aa =new ListNode(3);
//		a.next = b;b.next=c;c.next=cc;cc.next=bb;bb.next=aa;
		
		ListNode d =new ListNode(5);
		ListNode e =new ListNode(6);
		ListNode f =new ListNode(4);
		ListNode ff=new ListNode(6);
		ListNode ee=new ListNode(8);
		ListNode dd=new ListNode(7);
		d.next = e;e.next=f; f.next=ff;ff.next=ee;ee.next=dd;
		

		ListNode re=addTwoNumbers(a,d);
		while(re.next != null){
			System.out.println(re.val);
			re = re.next;
		}
		System.out.println(re.val);
	}

}

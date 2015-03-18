package cn.zp.leetcode;
import cn.zp.leetcode.ListNode;
import java.util.List;

//循环做法超时
public class MergerKsorterdList {

	/**
	 * @param args
	 */
	
	public static ListNode mergeTwo(ListNode l1,ListNode l2){
		ListNode result = new ListNode(0);
		ListNode value = result;
		while(l1 != null && l2 != null){
			if(l1.val<=l2.val){
				result.next = new ListNode(l1.val);
				l1 = l1.next;
				result = result.next;
			}else{			
				result.next = new ListNode(l2.val);
				l2 = l2.next;
				result = result.next;
			}
		}
		result.next = (l1 == null)?l2:l1;
		value = value.next;
        return value;
	}
	public static ListNode mergeKLists(List<ListNode> lists) {
        ListNode result=null;
        for(int i=0;i<lists.size();i++){
        	result = mergeTwo(result,lists.get(i));
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = null;
//		ListNode a =new ListNode(2);
//		ListNode b =new ListNode(4);
//		ListNode c =new ListNode(3);
//		ListNode cc =new ListNode(3);
//		ListNode bb =new ListNode(3);
//		ListNode aa =new ListNode(3);
//		a.next = b;b.next=c;c.next=cc;cc.next=bb;bb.next=aa;
		
		ListNode d =new ListNode(5);
		ListNode e =new ListNode(6);
		ListNode f =new ListNode(6);
		ListNode ff=new ListNode(6);
		ListNode ee=new ListNode(7);
		ListNode dd=new ListNode(7);
		d.next = e;e.next=f; f.next=ff;ff.next=ee;ee.next=dd;
		
		ListNode re = mergeTwo(a,d);
		while(re != null){
			System.out.println(re.val);
			re = re.next;
		}
		
	}

}

package cn.zp.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
class MyComparator implements Comparator<ListNode>{
	public int compare(ListNode a,ListNode b){
		return a.val - b.val;
	}
}

public class MegreKDevide {
	
	public static ListNode mergeKLists(List<ListNode> lists){
		if(lists.isEmpty()){
			return null;
		}
		PriorityQueue<ListNode> pq= new PriorityQueue<ListNode>(lists.size(),
				new MyComparator());
//		PriorityQueue<ListNode> pq= new PriorityQueue<ListNode>(lists.size(),new Comparator<ListNode>(){
//			public int compare(ListNode a,ListNode b){
//				return a.val - b.val;
//			}
//		});
		
		for(ListNode node : lists){
			if(node != null){
				pq.add(node);
			}
		}
		ListNode result = new ListNode(0);
		ListNode head = result;
		while(!pq.isEmpty()){
			ListNode temp = pq.poll();
			if(temp.next != null){
				pq.add(temp.next);
			}			
			head.next = temp;
			head = head.next;
		}
		return result.next;
	}
	
	public static void main(String[] args) {
//		ListNode a = null;
		ListNode a =new ListNode(2);
		ListNode b =new ListNode(4);
		ListNode c =new ListNode(3);
		ListNode cc =new ListNode(3);
		ListNode bb =new ListNode(3);
		ListNode aa =new ListNode(3);
		a.next = b;b.next=c;c.next=cc;cc.next=bb;bb.next=aa;
		
		ListNode d =new ListNode(5);
		ListNode e =new ListNode(6);
		ListNode f =new ListNode(6);
		ListNode ff=new ListNode(6);
		ListNode ee=new ListNode(7);
		ListNode dd=new ListNode(7);
		
		d.next = e;e.next=f; f.next=ff;ff.next=ee;ee.next=dd;
		List<ListNode> lists = new ArrayList<ListNode>();
		lists.add(a);
		lists.add(d);
		ListNode re = mergeKLists(lists);
		while(re != null){
			System.out.println(re.val);
			re = re.next;
		}
	}
}

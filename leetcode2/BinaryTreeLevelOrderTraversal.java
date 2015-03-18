package cn.zp.leetcode2;
import cn.zp.leetcode.*;
import java.util.*;

public class BinaryTreeLevelOrderTraversal {

	/**
	 * @param args
	 */
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> re = new ArrayList<List<Integer>>();
		Queue<TreeNode> s = new LinkedList<TreeNode>();
		Queue<TreeNode> t = new LinkedList<TreeNode>();
		if(root == null)
			return re;
		s.offer(root);
		
		while(!s.isEmpty() || !t.isEmpty()){
			List<Integer> temp = new ArrayList<Integer>();
			if(!s.isEmpty()){
				while(!s.isEmpty()){
					TreeNode tempNode = (TreeNode)s.poll();
					temp.add(tempNode.val);
					if(tempNode.left!=null)
						t.offer(tempNode.left);
					if(tempNode.right!=null)
						t.offer(tempNode.right);
				}
				re.add(temp);
			}else{
				while(!t.isEmpty()){
					TreeNode tempNode = (TreeNode)t.poll();
					temp.add(tempNode.val);
					if(tempNode.left!=null)
						s.offer(tempNode.left);
					if(tempNode.right!=null)
						s.offer(tempNode.right);
				}
				re.add(temp);
			}
			
			
			
		}
		
		return re;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

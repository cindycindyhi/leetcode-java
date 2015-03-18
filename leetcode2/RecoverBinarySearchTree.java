package cn.zp.leetcode2;
import cn.zp.leetcode.*;

public class RecoverBinarySearchTree {

	/**
	 * @param args
	 */
	TreeNode pre;
	TreeNode node1;
	TreeNode node2;
	public void inOrder(TreeNode root){
		if(root.left != null)
			inOrder(root.left);
		if(pre != null){
			if(pre.val > root.val){
				if(node1 == null){
					node1 = pre;
					node2 = root;
				}				
				else
					node2 = root;
			}
		}
		pre = root;
		if(root.right != null)
			inOrder(root.right);
		
	}
	public void recoverTree(TreeNode root) {
        node1=node2 = pre = null;
        inOrder(root);
        if(node1 != null && node2!=null){
        	int temp = node1.val;
            node1.val = node2.val;
            node2.val = temp;
        }
        
    }


}

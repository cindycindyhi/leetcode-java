package cn.zp.leetcode;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

import cn.zp.leetcode.*;
public class PostOrder {

	/**
	 * @param args
	 */
	public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> re = new ArrayList<Integer>();
        if(root == null)
        	return re;
		if(root.left!=null)
			re.addAll(re.size(), postorderTraversal(root.left));
		if(root.right!=null)
			re.addAll(re.size(), postorderTraversal(root.right));
		re.add(root.val);
		return re;
    }
	public static List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> re = new ArrayList<Integer>();
        if(root == null)
        	return re;
		if(root.left!=null)
			re.addAll(re.size(), inOrderTraversal(root.left));
		re.add(root.val);
		if(root.right!=null)
			re.addAll(re.size(), inOrderTraversal(root.right));	
		return re;
    }
	public static List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> re = new ArrayList<Integer>();
        if(root == null)
        	return re;
        re.add(root.val);
		if(root.left!=null)
			re.addAll(re.size(), preOrderTraversal(root.left));		
		if(root.right!=null)
			re.addAll(re.size(), preOrderTraversal(root.right));	
		return re;
    }
	public static List<Integer> postorderTraversalNoRec(TreeNode root){
		Stack stack = new Stack();
		List<Integer> re = new ArrayList<Integer>();
        if(root == null)
        	return re;
        TreeNode temp = root;
        while(temp != null){
        	
        }
		
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n1 = new TreeNode(2);
		TreeNode n2 = new TreeNode(1);
		TreeNode n3 = new TreeNode(7);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(8);
		TreeNode n6 = new TreeNode(3);
		TreeNode n7 = new TreeNode(6);
		n1.left = n2;
		n1.right = n3;
		n3.left = n4;
		n3.right = n5;
		n4.left = n6;
		n4.right = n7;
		
		List<Integer> re = new ArrayList<Integer>();
		re=inOrderTraversal(n1);
		for(int i=0;i<re.size();i++)
			System.out.println(re.get(i));

	}

}

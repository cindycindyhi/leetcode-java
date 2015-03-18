package cn.zp.leetcode2;

import cn.zp.leetcode.TreeNode;

public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n1 = new TreeNode(4);
		TreeNode n2 = new TreeNode(1);
		TreeNode n3 = new TreeNode(7);
		TreeNode n4 = new TreeNode(2);
		TreeNode n5 = new TreeNode(8);
		TreeNode n6 = new TreeNode(3);
		TreeNode n7 = new TreeNode(6);
		n1.left = n2;
		n1.right = n3;
		n3.left = n4;
		n3.right = n5;
		n4.left = n6;
		n4.right = n7;
		RecoverBinarySearchTree re = new RecoverBinarySearchTree();
		re.recoverTree(n1);
		System.out.println(n1.val);
		
		MaximumDepthofBinaryTree max = new MaximumDepthofBinaryTree();
		System.out.println(max.maxDepthN(n1));
	}
}

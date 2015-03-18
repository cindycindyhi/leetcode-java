package cn.zp.leetcode2;
import cn.zp.leetcode.*;
import java.util.*;
class Layer{
	TreeNode node;
	int level;
	public Layer(TreeNode node,int level) {
		// TODO Auto-generated constructor stub
		this.node = node;
		this.level = level;
	}
}
public class MaximumDepthofBinaryTree {
	
	//求二叉树的最大深度，--从根节点到叶节点最长路径上的节点的个数
	//深度优先搜索

	/**
	 * @param args
	 */
	//非递归形式代码
	public  int maxDepthN(TreeNode root){
		if(root == null)
			return 0;
		Queue<Layer> queue = new LinkedList<Layer>();
		int level = 1;
		Layer l = new Layer(root,1);
		queue.add(l);
		while(!queue.isEmpty()){
			Layer temp = queue.poll();
			TreeNode curNode = temp.node;
			level = temp.level;

			if(curNode.left != null){
				queue.offer(new Layer(curNode.left,level+1));
			}
			if(curNode.right != null){
				queue.offer(new Layer(curNode.right,level+1));
			}
		}
		
		return level;
	}
	//递归形式代码
	public static int maxDepth(TreeNode root) {
     
		if(root == null)
			return 0;
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		return Math.max(left, right)+1;
    }
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
		
		
		System.out.println(maxDepth(n1));
	}

}

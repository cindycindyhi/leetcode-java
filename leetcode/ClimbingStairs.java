package cn.zp.leetcode;

public class ClimbingStairs {

	/**
	 * @param args
	 */
	public static int climbStairs(int n) {
	   if(n==1 || n==0)
		   return 1;
	   if(n==0)
		   return 0;
	   return climbStairs(n-1)+climbStairs(n-2);
	}
	public static int climbStairs2(int n) {
		   int arr[] = new int[n+1];
		   arr[1]=1;
		   arr[2]=2;
		   if(n<=2)
			   return n;
		   for(int i=3;i<=n;i++)
			   arr[i]=arr[i-1]+arr[i-2];
		   return arr[n];
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs2(55));

	}

}

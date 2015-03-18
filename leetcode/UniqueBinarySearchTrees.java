package cn.zp.leetcode;

public class UniqueBinarySearchTrees {

	/**
	 * @param args
	 */
	public static int numTrees(int n) {
		int result = 0;
        int dp[] = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
        	if(i%2 == 0){
        		for(int j=0;j<i/2;j++)
        			dp[i]=dp[i] + dp[j]*dp[i-1-j]*2;
        	}else{
        		for(int j=0;j<i/2;j++)
        			dp[i]=dp[i] + dp[j]*dp[i-1-j]*2;
        		dp[i] = dp[i] + dp[i/2]*dp[i/2];
        	}
        }
        
        
        return dp[n];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numTrees(5));
	}

}

package cn.zp.leetcode;

public class uniquePath1 {

	/**
	 * @param args
	 */
	public static int uniquePaths(int m, int n) {
		int dp[][] = new int[m][];
		for(int i=0;i<m;i++){
			dp[i]=new int[n];
		}
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++){
				if(i==0 || j==0)
					dp[i][j]=1;
				else
					dp[i][j]=dp[i-1][j]+dp[i][j-1];
				
			}
        return dp[m-1][n-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(uniquePaths(3,2));

	}

}

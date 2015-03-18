package cn.zp.leetcode;

public class DistinctSubsequences {

	/**
	 * @param args
	 */
	public static int numDistinct(String S, String T) {
		int [][]dp = new int[T.length()+1][];
		for(int i=0;i<=T.length();i++){
			dp[i] = new int[S.length()+1];
			if(i != 0)
				dp[i][0]=0;
		}
		for(int j=0;j<=S.length();j++)
			dp[0][j] = 1;
		
		for(int i=1;i<=T.length();i++)
			for(int j=1;j<=S.length();j++){
				if(T.charAt(i-1) != S.charAt(j-1))
					dp[i][j]=dp[i][j-1];
				else
					dp[i][j]=dp[i][j-1]+dp[i-1][j-1];
			}
		
		
        return dp[T.length()][S.length()];
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit";
		String t = "rabit";
		System.out.println(numDistinct(s,t));
		

	}

}

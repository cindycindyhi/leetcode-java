package cn.zp.leetcode;

public class InterleavingString {

	/**
	 * @param args
	 */
//	res[i][j]表示用s1的前i个字符和s2的前j个字符能不能按照规则表示出s3的前i+j个字符，如此最后结果就是
//	res[s1.length()][s2.length()]，判断是否为真即可。接下来就是递推式了，假设知道res[i][j]之前的
//	所有历史信息，我们怎么得到res[i][j]。可以看出，其实只有两种方式来递推，一种是选取s1的字符作为s3新加
//	进来的字符，另一种是选s2的字符作为新进字符。而要看看能不能选取，就是判断s1(s2)的第i(j)个字符是否与
//	s3的i+j个字符相等。如果可以选取并且对应的res[i-1][j](res[i][j-1])也为真，就说明s3的i+j个字符
//	可以被表示。这两种情况只要有一种成立，就说明res[i][j]为真，是一个或的关系。所以递推式可以表示成
//	res[i][j] = res[i-1][j]&&s1.charAt(i-1)==s3.charAt(i+j-1) || res[i][j-1]&&s2.charAt(j-1)==s3.charAt(i+j-1)
//	时间上因为是一个二维动态规划，所以复杂度是O(m*n)
	public boolean isInterleave(String s1, String s2, String s3) {
        
		if(s1.length()+s2.length()!=s3.length())
	        return false;
	    String minWord = s1.length()>s2.length()?s2:s1;
	    String maxWord = s1.length()>s2.length()?s1:s2;
	    boolean[] res = new boolean[minWord.length()+1];
	    res[0] = true;
	    for(int i=0;i<minWord.length();i++)
	    {
	        res[i+1] = res[i] && minWord.charAt(i)==s3.charAt(i);
	    }
	    for(int i=0;i<maxWord.length();i++)
	    {
	        res[0] = res[0] && maxWord.charAt(i)==s3.charAt(i);
	        for(int j=0;j<minWord.length();j++)
	        {
	            res[j+1] = res[j+1]&&maxWord.charAt(i)==s3.charAt(i+j+1) || res[j]&&minWord.charAt(j)==s3.charAt(i+j+1);
	        }
	    }
	    return res[minWord.length()];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

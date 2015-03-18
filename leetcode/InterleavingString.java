package cn.zp.leetcode;

public class InterleavingString {

	/**
	 * @param args
	 */
//	res[i][j]��ʾ��s1��ǰi���ַ���s2��ǰj���ַ��ܲ��ܰ��չ����ʾ��s3��ǰi+j���ַ���������������
//	res[s1.length()][s2.length()]���ж��Ƿ�Ϊ�漴�ɡ����������ǵ���ʽ�ˣ�����֪��res[i][j]֮ǰ��
//	������ʷ��Ϣ��������ô�õ�res[i][j]�����Կ�������ʵֻ�����ַ�ʽ�����ƣ�һ����ѡȡs1���ַ���Ϊs3�¼�
//	�������ַ�����һ����ѡs2���ַ���Ϊ�½��ַ�����Ҫ�����ܲ���ѡȡ�������ж�s1(s2)�ĵ�i(j)���ַ��Ƿ���
//	s3��i+j���ַ���ȡ��������ѡȡ���Ҷ�Ӧ��res[i-1][j](res[i][j-1])ҲΪ�棬��˵��s3��i+j���ַ�
//	���Ա���ʾ�����������ֻҪ��һ�ֳ�������˵��res[i][j]Ϊ�棬��һ����Ĺ�ϵ�����Ե���ʽ���Ա�ʾ��
//	res[i][j] = res[i-1][j]&&s1.charAt(i-1)==s3.charAt(i+j-1) || res[i][j-1]&&s2.charAt(j-1)==s3.charAt(i+j-1)
//	ʱ������Ϊ��һ����ά��̬�滮�����Ը��Ӷ���O(m*n)
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

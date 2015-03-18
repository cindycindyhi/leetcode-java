package cn.zp.leetcode;

public class LongestCommonPrefix {
	public static int findMin(String[] strs){
		int result = 0;
		int minLen =1000;
		for(int i=0; i<strs.length;i++){
			if(strs[i].length() < minLen){
				minLen = strs[i].length();
				result = i;
			}
		}
		return result;
	}
	public static String longestCommonPrefix(String[] strs) {
       if(strs.length == 0){
			return "";
		}
        int minLen = findMin(strs);
        String str0 = strs[minLen];
       // System.out.println(minLen);
        for(int k=0; k<str0.length();k++){
        	for(int i=0; i<strs.length;i++){
            	String str = strs[i];
            	if(str.charAt(k) != str0.charAt(k))
            		return str0.substring(0,k);
        	}
        }
        return str0;       
    }
	public static void main(String[] args) {
		String[] strs = new String[3];
		strs[0] = "aaa";
		strs[1] = "add";
		strs[2] = "add";
		System.out.println(longestCommonPrefix(strs));
	}
}

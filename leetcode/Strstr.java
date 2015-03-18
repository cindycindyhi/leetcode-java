package cn.zp.leetcode;

public class Strstr {
	public static int strStr(String haystack, String needle) {
        int begin =0;
        int find = 0;
        if(haystack.length()==0)
        	return -1;
        if(haystack.equals(needle)||needle.length()==0)
        	return 0;
        for(begin =0;begin<=haystack.length()-needle.length();begin++){
        	if(haystack.charAt(begin) == needle.charAt(0)){
        		for(find=0;find<needle.length();find++){
        			if(haystack.charAt(begin+find)!=needle.charAt(find))
        				break;
        		}
        		if(find == needle.length())
        			return begin;
        	}
        }

//        for(int i=0; i<haystack.length();i++){
//        	if(haystack.charAt(i) == needle.charAt(0)){
//        		begin = i;
//        		for(find=0;find<needle.length();find++){
//        			if(i+find<haystack.length()){
//        				if(haystack.charAt(i+find)!=needle.charAt(find))
//        					break;
//        			}else
//        				break;
//        		}
//        		if(find == needle.length())
//        			return i;
//        		i=i+find;
//        	}
//        }	
		return -1;
    }
	
	public static void main(String[] args) {
		String hay ="aaab";
		String needle = "ab";
		System.out.println(strStr(hay,needle));
	}
}

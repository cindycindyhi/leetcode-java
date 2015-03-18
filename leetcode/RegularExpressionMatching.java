package cn.zp.leetcode;

public class RegularExpressionMatching {
	public static void main(String[] args) {
	    System.out.println(isMatch("aa","a"));
	    System.out.println(isMatch("aa","aa"));
	    System.out.println(isMatch("aaa","aa"));
	    System.out.println(isMatch("aa", "a*"));
	    System.out.println(isMatch("aa", ".*"));
	    System.out.println(isMatch("ab", ".b"));
	    System.out.println(isMatch("aab", "c*a*b"));
	  }
	  public static boolean isMatch(String s,String p){
	    if(p.length() == 0)
	      return s.length() == 0;
	    if(p.length() == 1 || p.charAt(1) != '*'){
	      if(s.length()  < 1 || (p.charAt(0) != '.' && s.charAt(0) != p.charAt(0)))
	        return false;
	      return isMatch(s.substring(1),p.substring(1));
	    }else{
	      int i = -1;
	      while(i < s.length() && (i < 0 || p.charAt(0) == '.' || p.charAt(0) == s.charAt(i))){
	        if(isMatch(s.substring(i+1),p.substring(2)))
	          return true;
	        i++;
	      }
	      return false;
	    }
	    
	  }
}

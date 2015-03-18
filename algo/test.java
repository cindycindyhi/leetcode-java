package cn.zp.algo;

public class test {

	/**
	 * @param args
	 */
	static int ViolentMatch(String s, String p)  
	{  
	    int sLen = s.length();  
	    int pLen = p.length();  
	  
	    int i = 0;  
	    int j = 0;  
	    while (i < sLen && j < pLen)  
	    {  
	        if (s.charAt(i) == p.charAt(j))  
	        {  
	            //①如果当前字符匹配成功（即S[i] == P[j]），则i++，j++      
	            i++;  
	            j++;  
	        }  
	        else  
	        {  
	            //②如果失配（即S[i]! = P[j]），令i = i - (j - 1)，j = 0      
	            i = i - j + 1;  
	            j = 0;  
	        } 
	        
	    }  
	    //匹配成功，返回模式串p在文本串s中的位置，否则返回-1  
	    if (j == pLen)  
	        return i - j;  
	    else
	        return -1;  
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcbed";
		String p = "cb";
		
		System.out.println(ViolentMatch(s,p));

	}

}

package cn.zp.leetcode;

import java.util.Scanner;

public class StrToInt {

	/**
	 * @param args
	 */
	
	    public static  int atoi(String  str) {
	        long result = 0;
	        int flag = 1;
	        str.trim();
	        char s[];
	        int num_white=0;
	        for(int i=0;i<str.length();i++){
	        	if(str.charAt(i)==' '){
	        		num_white++;
	        	}
	        	else
	        		break;
	        }
	        str=str.substring(num_white);
	        
	        if(str==null || str=="" )
	        	return 0;
	        if(str.isEmpty())
	            return 0;
	        if(str.charAt(0)=='+'){
	        	flag = 1;
	        	s=str.substring(1).toCharArray();
	        }else if(str.charAt(0)=='-'){
	        	flag = -1;
	        	s=str.substring(1).toCharArray();
	        }else if(str.charAt(0)<48 || str.charAt(0)>57){
	        	return 0;
	        }else
	        	s=str.toCharArray();
	        for(int i=0;i<s.length;i++){
	        	if(s[i]>=48 && s[i]<=67){
	        		result=result*10;
	        		result = (result+(s[i]-48 ));
	        	}else
	        		break;
	        }
	        result = result * flag;
	        int output = 0;
	        //result = flag*result/10;
	        if(result>2147483646)
	        	output = 2147483647;
	        else if(result < -2147483647 )
	        	output = -2147483648;
	        else
	        	output = (int)result;
	        
	        return output;
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int result = atoi(str);
		System.out.println(result);
		

	}

}

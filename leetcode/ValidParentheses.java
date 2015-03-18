package cn.zp.leetcode;
import java.util.*;

public class ValidParentheses {

	/**
	 * @param args
	 */
	public static boolean isValid(String s) {
        Stack<String> stack = new Stack<String>();
        Map<String,String> oper = new HashMap<String,String>();
        oper.put("(", ")");
        oper.put("[", "]");
        oper.put("{","}");
        for(int i=0; i<s.length();i++){
        	String temp = String.valueOf(s.charAt(i));
        	if((s.charAt(i)!='(')&&(s.charAt(i)!=')') &&(s.charAt(i)!='[')
        			&&(s.charAt(i)!=']') &&(s.charAt(i)!='{') &&(s.charAt(i)!='}'))
        		continue;
        	else if(oper.containsKey(temp))
        		stack.push(temp);
        	else{
        		if(stack.isEmpty())
        			return false;
//        		System.out.println(oper.get(stack.pop()));
        		String tt = oper.get(stack.pop());
        		if(!temp.equals(tt))
        			return false;
        	}
        	
        }
        if(!stack.isEmpty())
        	return false;
        return true;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "()";
		System.out.println(isValid(s));
	}


}

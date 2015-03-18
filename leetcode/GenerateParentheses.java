package cn.zp.leetcode;
import java.util.*;

public class GenerateParentheses {

	/**
	 * @param args
	 */
	public static List<String> geneBasic(List<String> list1,int n){
		List<String> result = new ArrayList<String>();
		for(int j=0;j<list1.size();j++){
			for(int i=1;i<=n;i++){

				Stack<String> stack = new Stack<String>();
				String temp="";
				temp = temp +"(";
				stack.push("(");
				int numleft = 1;
				int numright = 1;
				boolean flag = true;
				boolean jia = true;
				int pp =0;
				for(int m=0; m<list1.get(j).length();m++){
					if(list1.get(j).charAt(m)==')'){
						if(!stack.empty())
						{stack.pop();
						temp = temp +")";
						numright++;}
					}
					if(numright == numleft && numleft == i){
						if(flag){
						if(!stack.empty())
						{stack.pop();
						temp = temp + ")";
						pp = numleft;
						}
						if(!stack.empty()){
							jia = false;
							break;}
						}
						flag = false;
					}
					if(list1.get(j).charAt(m)=='('){
						stack.push("(");
						temp = temp +"(";
						numleft ++;
					}
				}
				if(jia && pp == i)
					result.add(temp);
			}
		}
		
		return result;
	}
	
	public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        
       
        result.add("()");
        if(n == 1)
        	return result;
        
        for(int i=2;i<=n;i++)
        	result= geneBasic(result,i);
        
        
        
        
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> result = new ArrayList<String>();
		//result.add("()()()");
		//result.add("()()");
		result= generateParenthesis(4);
		System.out.println(result.size());
		for(int i=0;i<result.size();i++)
			System.out.println(result.get(i));
		
	}
	//递归的做法！！！！采用递归树的思想，当左括号数大于右括号数
	//时可以加左或者右括号，否则只能加左括号，当左括号数达到n时，剩下全部加右括号
	class Solution {  
	    public ArrayList<String> generateParenthesis(int n) {  
	        // Note: The Solution object is instantiated only once and is reused by each test case.  
	        ArrayList<String> res = new ArrayList<String>();  
	        generate(res, "", 0, 0, n);  
	        return res;  
	    }  
	    public void generate(ArrayList<String> res, String tmp, int lhs, int rhs, int n)  
	    {  
	        if(lhs == n)  
	        {  
	            for(int i = 0; i < n - rhs; i++)  
	            {  
	                tmp += ")";  
	            }  
	            res.add(tmp);  
	            return ;  
	        }  
	        generate(res, tmp + "(", lhs + 1, rhs, n);  
	        if(lhs > rhs)  
	            generate(res, tmp + ")", lhs, rhs + 1, n);  
	    }  
	}

}

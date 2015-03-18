package cn.zp.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IntToRoman {

	public static String basic(int stack_num,int large,Stack<Integer> stack,Map<Integer,String> roman){
		String result="";
		for(int k=0; k<stack_num&&large!=0;k++){
    		int temp = stack.pop();
    		if(roman.containsKey(temp)){
    			result=result+roman.get(temp);
    		}else if(temp/large<4){
    			for(int i =0;i<temp/large;i++){
    				result=result+roman.get(large);
    			}
    		}else{
    			result=result+roman.get(large*10/2);
    			for(int i =0;i<temp/large-5;i++){
    				result=result+roman.get(large);
    			}
    		}
    		large = large /10;	
    	}
		return result;
	}
	public static String intToRoman(int num) {
        String result = "";
        int origin = num;
        int large = 1;
        Map<Integer,String> roman = new HashMap<Integer,String>();
        roman.put(1,"I");
        roman.put(4,"IV");
        roman.put(5,"V");
        roman.put(9,"IX");
        roman.put(10,"X");
        roman.put(40,"XL");
        roman.put(50,"L");
        roman.put(90,"XC");
        roman.put(100,"C");
        roman.put(400,"CD");
        roman.put(500,"D");
        roman.put(900,"CM");
        roman.put(1000,"M");
        Stack<Integer> stack = new Stack<Integer>();
        
        if(origin<=3999){
        	while(num!=0){
            	int temp = num % 10 *large;
            	
            	stack.push(temp);
            	num = num / 10;
            	large = large * 10;
            }
            large = large / 10;
            int stack_num = stack.size();
        	result = basic(stack_num,large,stack,roman);
        }else{
        	while(num!=0){
            	int temp = num % 10 *large;
            	stack.push(temp);
            	num = num / 10;
            	large = large * 10;
            	if(large == 1000){
            		large =1;
            	}
            }
        	large = large / 10;
            int stack_num = stack.size();
        	result = basic(stack_num,large,stack,roman);
        	for(int k=0;k<stack_num/3;k++){
        		result = result+basic(stack_num,100,stack,roman);
        	}
        }
        
        return result; 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intToRoman(6));

	}

}

package cn.zp.leetcode;
import java.util.HashMap;
import java.util.Map;
public class RomanToInt {

	/**
	 * @param args
	 */
	public static int romanToInt(String s) {
        int result = 0;
        Map<String,Integer> roman = new HashMap<String,Integer>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);
        int i = 0;
        for(i=0;i<s.length()-1;){
        	String now = s.substring(i, i+1);
        	String next = s.substring(i+1, i+2);
        	int nowNum = roman.get(now);
        	int nextNum = roman.get(next);
        	if(nowNum<nextNum){
        		result = result + nextNum - nowNum;
        		i = i+2;
        	}else{
        		result = result + nowNum;
        		i=i+1;
        	}
        }
        if(i<s.length()){
        	result = result + roman.get(s.substring(i, i+1));
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MCMLXXVI";
		System.out.println(romanToInt(s));

	}

} 

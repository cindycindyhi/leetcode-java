package cn.zp.leetcode;
import java.util.*;

public class Triangle {
	public static int minimumTotal(List<List<Integer>> triangle) {
        int result =99999;
        List<List<Integer>> list=new ArrayList<List<Integer>>();

        
        for(int i=0;i<triangle.size();i++){
        	List<Integer> num = new ArrayList<Integer>();
        	if(i == 0)
        		list.add(triangle.get(0));
        	else{
        		for(int j=0; j<triangle.get(i).size();j++){
        			int temp =0;
        			if(j-1>=0 && j<triangle.get(i).size()-1)
        				temp = Math.min(list.get(i-1).get(j-1)+triangle.get(i).get(j),
        						list.get(i-1).get(j)+triangle.get(i).get(j));
        			else if(j==triangle.get(i).size()-1)
        				temp = list.get(i-1).get(j-1)+triangle.get(i).get(j);
        			else
        				temp = list.get(i-1).get(j)+triangle.get(i).get(j);
        			num.add(temp);
        		}
        		list.add(num);
        	}
        	
        }
        for(int i=0;i<list.get(triangle.size()-1).size();i++){
        	List<Integer> num = list.get(triangle.size()-1);
        	for(int j=0; j<num.size();j++)
        		if(num.get(j)<result)
        			result = num.get(j);
        }
        
        return result;
    }
	public static void main(String[] args) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		List<Integer> num = new ArrayList<Integer>();
		num.add(2);
		list.add(num);
		List<Integer> num1 = new ArrayList<Integer>();
		num1.add(3);num1.add(4);
		list.add(num1);
		
		List<Integer> num2 = new ArrayList<Integer>();
		num2.add(6);num2.add(5);num2.add(7);
		list.add(num2);
		
		List<Integer> num3 = new ArrayList<Integer>();
		num3.add(4);num3.add(1);num3.add(8);num3.add(3);
		list.add(num3);
		
		
		System.out.println(minimumTotal(list));
		
		
	}
}











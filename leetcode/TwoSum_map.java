package cn.zp.leetcode;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_map {
	private int result[] = new int[2];	
	private Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	public int[] twoSum(int[] numbers, int target) {    
		for(int i=0;i<numbers.length;i++)
			if(map.containsKey(numbers[i])){
				result[0]=map.get(numbers[i])+1;
				result[1]=i+1;
			
			}else{
				map.put(target-numbers[i], i);
			}
		return result;
    }
}

package cn.zp.leetcode;

public class TwoSum {
	private int result[] = new int[2];	
	public int[] twoSum(int[] numbers, int target) {    
		for(int i=0;i<numbers.length;i++)
			for(int j=i+1;j<numbers.length;j++){
				if((numbers[i]+numbers[j])==target){
					result[0]=i+1;
					result[1]=j+1;
					break;
				}
				if((numbers[i]+numbers[j])>target){
					continue;
				}	
			}		
		return result;
    }
}

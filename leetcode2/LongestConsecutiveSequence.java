package cn.zp.leetcode2;
import java.util.*;

public class LongestConsecutiveSequence {

	/**
	 * @param args
	 */
	//给定一个未排序的（数字）数组，找到数组中得到最长连续的子序列长度
	//[100, 4, 200, 1, 3, 2]  [1, 2, 3, 4]
	//时间复杂度为O(n)
	public static int longestConsecutive2(int[] num){
		Set set = new HashSet<Integer>();
		for(int e:num){
        	set.add(e);
        }
		int max = 1;
		for(int e:num){
			int left = e-1;
			int right = e+1;
			int count = 1;
			System.out.println("e,left,right"+e+"  "+left+"  "+right);
			while(set.contains(left)){
				count++;
				set.remove(left);
				left--;
			}
			while(set.contains(right)){
				count++;
				set.remove(right);
				right++;
			}
			max = Math.max(max, count);	
		}	
		return max;
	}
	public static int longestConsecutive(int[] num) {
        Map map = new HashMap<Integer,Integer>();
        for(int i=0;i<num.length;i++){
        	map.put(num[i],	1);
        }
        for(int i=0;i<num.length;i++){
        	
        	if(map.containsKey(num[i]-1)){
        		Integer ss = (Integer)map.get(num[i]);
            	int temp = ss.intValue();
        		Integer s = (Integer)map.get(num[i]-1);
        		int now = s.intValue()+temp;
        		map.put(num[i], now);
        		//map.put(num[i]-1, now);
        	}
        	if(map.containsKey(num[i]+1)){
        		Integer ss = (Integer)map.get(num[i]);
            	int temp = ss.intValue();
        		Integer s = (Integer)map.get(num[i]+1);
        		int now = s.intValue()+temp;
        		map.put(num[i], now);
        		//map.put(num[i]+1, now);
        	}
        	if(!map.containsKey(num[i]+1) && !map.containsKey(num[i]-1)){
        		map.put(num[i], 1);
        	}
        	
        }

        int max = 0;
        for(int i=0;i<map.size();i++){
        	if((Integer)map.get(num[i])>max)
        		max =(Integer)map.get(num[i]);
        		
        }
		
		return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {100,4,200,1,2,3,5,6};
		System.out.println(longestConsecutive2(n));

	}

}

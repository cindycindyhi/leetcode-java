package cn.zp.leetcode;
import java.util.*;
class ReverseInt {

	/**
	 * @param args
	 */
	public int reverse(int x){
		int result=0;
		int length = 1;
		int num[]=new int[1000];
		if(x/10 == 0)
			return x;
		while(x/10 != 0){
			int temp = x % 10;
			num[length-1] = temp;
			length++;
			x = x/10;
		}
		int num2[] = new int[length];
		int j=0;
		boolean flag = false;
		for(int i=0;i<length;i++){
			if(num[i] != 0)
				flag = true;
			if(flag == true){
				num2[j++] = num[i];
			}
		}
		
		
		for(int i=length-1;i>-1;i--){
			
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

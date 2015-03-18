package cn.zp.three_sum;
import java.util.*;
public class test01 {

	/**
	 * @param args
	 */
	static int  binarySort(int dest,int[]arr){
		int end = arr.length-1;
		int begin = 0;
		int mid = 0;
		while(begin <= end){
//			mid = ( begin + end)/2;
			//为了防止上式产生结果溢出的问题，因为begin+end 有可能超出类型范围
			mid = begin + ( end - begin)/2;
			if(arr[mid] == dest)
				return 1;
			if(dest > arr[mid])
				begin = mid + 1;
			else
				end = mid - 1;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,8,33,2};
		Arrays.sort(arr);
		System.out.println(binarySort(0,arr));
		
		
		

	}

}

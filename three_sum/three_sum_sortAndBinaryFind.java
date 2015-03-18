package cn.zp.three_sum;
import java.util.*;

import java.util.Scanner;
//�ȶ��������� Ȼ����-��a+b�����������ж��ֲ���
public class three_sum_sortAndBinaryFind {

	/**
	 * @param args
	 */
	static int  binarySort(int dest,int[]arr){
		int end = arr.length-1;
		int begin = 0;
		int mid = 0;
		while(begin <= end){
//			mid = ( begin + end)/2;
			//Ϊ�˷�ֹ��ʽ���������������⣬��Ϊbegin+end �п��ܳ������ͷ�Χ
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
	
	public static int Sum2(int []arr){
		int count=0;
		int len = arr.length;
		for(int i=0;i<len;i++)
			for(int j=i+1;j<len;j++)
				{
					int temp = -(arr[i]+arr[j]);
					System.out.println(temp);
					int temp_len = arr.length - j -1;
					int temp_arr[] = new int[temp_len];
					for(int m=j+1;m<arr.length;m++){
						temp_arr[m-j-1]=arr[m];
					}
					
					if(binarySort(temp,temp_arr) == 1)
						count ++;
				}
		return count;
	}
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		int i=0;
		while(scanner.hasNextInt()){
			arr[i++] = scanner.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println(Sum2(arr));
	}

}

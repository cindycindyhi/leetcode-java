package cn.zp.three_sum;

import java.util.Scanner;

public class three_sum_greedy {

	public static int Sum(int []arr){
		int count=0;
		int len = arr.length;
		for(int i=0;i<len;i++)
			for(int j=i+1;j<len;j++)
				for(int k=j+1;k<len;k++)
				{
					if(0==arr[i]+arr[j]+arr[k])
						count++;
				}
		return count;
	}
	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		int i=0;
		while(scanner.hasNextInt()){
			arr[i++] = scanner.nextInt();
		}
		System.out.println(Sum(arr));
	}
}

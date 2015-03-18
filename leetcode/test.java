package cn.zp.leetcode;

import java.util.Scanner;

public class test {

	public static long Inverse(int input){
		long result = 0;
		
		do{
			result = result * 10 + input % 10;
			//input /= 10;
		}while((input/=10)!=0);
		return result;
	}
	public static boolean isPalindrome(int input){
		int ori = input;
		long result = 0;	
		do{
			result = result * 10 + input % 10;
		}while((input/=10)!=0);
		if(result == ori)
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		while(true){
			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			System.out.println(isPalindrome(input));
		}
	}
}

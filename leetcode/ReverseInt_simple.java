package cn.zp.leetcode;

public class ReverseInt_simple {

	/**
	 * @param args
	 */
	public static long reverse(int x){
		long result=0;
		int flag = x>0?1:-1;
		x = Math.abs(x);
		while(x!=0){
			//解决x的末尾为0的问题
			result = result *10 + x%10;
			x = x/10;
		}
		result = result * flag;
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1000000003;
		System.out.println(reverse(x));

	}

}

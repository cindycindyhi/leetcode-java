package cn.zp.leetcode;

public class RemoveDuplicate {

	/**
	 * @param args
	 */
	
//  该方法超时！！
//	public static int removeDuplicates(int[] A) {
//        int length = A.length;
//        for(int i = 1; i<A.length; i++){
//        	if(A[i] == A[i-1]){
//        		for(int j=i;j<A.length-1;j++){
//        			A[j] = A[j+1];
//        		}
//        		length--;
//        	}
//        }
//        return length;
//    }

	
//因为A的比较完的部分可以作为存储新数组的空间。。
	public static int removeDuplicates(int[] A) {
        int length = 1;
        if(A.length == 0)
        	return 0;
        for(int i = 1; i<A.length; i++){
        	if(A[i] != A[i-1])
        		A[length]=A[i];
        }
        return length;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {1,2,2,2,3,3,4};
		System.out.println(removeDuplicates(a));

	}

}

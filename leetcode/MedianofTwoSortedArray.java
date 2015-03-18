package cn.zp.leetcode;
import java.util.Arrays;
public class MedianofTwoSortedArray {
	public double findMedianSortedArrays(int A[], int B[]) {
        double result = 0;
        int m = A.length;
        int n = B.length;
        int c[] = new int[m+n];
        
        System.arraycopy(A, 0, c, 0, m);
        System.arraycopy(B, 0, c, m, n);
        Arrays.sort(c);
        
        result = ((m+n)%2==0)? c[(m+n)/2-1] :c[(m+n)/2];
        return result;
    }
}

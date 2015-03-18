package cn.zp.leetcode;

public class MostWater {

	/**
	 * @param args
	 */
//	首先，我们假设找到了最大的容积S，即由ai，aj和x轴围成，那么我们想一下，此时如果i的左边有比ai大的数，
//	那么此时最大面积就不可能是S了（因为x轴的长度增加了，而高度最少是保证很原来相等的，当增加的是较长的边
//	不影响高度，这是由短板理论决定的。），同理，j的右边也是如此。此时，我们得出了一个结论，当出现最大面积
//	时，i的左边和j的右边的高度都比ai和aj小。
//	那么，现在考虑i和j的中间，当中间有比ai和aj大的数时，有可能出现比S更大的容积，因为尽管x轴减小了，当
//	高度补齐了它的不足。所以，我们从两头向中间靠拢，同时更新候选值；在收缩区间的时候优先从  x, y中较小
//	的边开始收缩（这点很重要，若是从较大的开始收缩会越来越小）。
	
	public int maxArea(int[] height) {
		int result = 0;
		int i=0,j=height.length-1;
		while(i<j){
			int max=(j-i)*Math.min(height[i], height[j]);
			result = Math.max(result,max);
			if(height[i]<=height[j])
				i++;
			else
				j--;
		}
		return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

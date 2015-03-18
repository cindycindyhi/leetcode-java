package cn.zp.leetcode;

public class MostWater {

	/**
	 * @param args
	 */
//	���ȣ����Ǽ����ҵ��������ݻ�S������ai��aj��x��Χ�ɣ���ô������һ�£���ʱ���i������б�ai�������
//	��ô��ʱ�������Ͳ�������S�ˣ���Ϊx��ĳ��������ˣ����߶������Ǳ�֤��ԭ����ȵģ������ӵ��ǽϳ��ı�
//	��Ӱ��߶ȣ������ɶ̰����۾����ġ�����ͬ��j���ұ�Ҳ����ˡ���ʱ�����ǵó���һ�����ۣ�������������
//	ʱ��i����ߺ�j���ұߵĸ߶ȶ���ai��ajС��
//	��ô�����ڿ���i��j���м䣬���м��б�ai��aj�����ʱ���п��ܳ��ֱ�S������ݻ�����Ϊ����x���С�ˣ���
//	�߶Ȳ��������Ĳ��㡣���ԣ����Ǵ���ͷ���м俿£��ͬʱ���º�ѡֵ�������������ʱ�����ȴ�  x, y�н�С
//	�ı߿�ʼ������������Ҫ�����Ǵӽϴ�Ŀ�ʼ������Խ��ԽС����
	
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

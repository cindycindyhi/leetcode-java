package cn.zp.leetcode;

public class RegularExpression {

	/**
	 * @param args
	 */
	//��������ǳ������ᣡ�����Ͻ�ȥ��������ʽ������������������������
	// a*��ʾ��������߶��a��.*��ʾ����������㣬����.*���Ա�ʾ�ظ������. �����ַ����Լ��մ�
	
	public static boolean isMatch(String s, String p) {
//        boolean flag = false;
//        int i=0;
//        for(int j=0;i<s.length()&&j<p.length();){
//        	if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='.'){
//        		i++;
//        		j++;
//        		flag = true;
//        	}else if(p.charAt(j)=='*'){
//        		if(j>=1 && (p.charAt(j-1)==s.charAt(0)||p.charAt(j-1)=='.'))
//        			return true;
//        		else
//        			j++;
//        	}else{
//        		j++;
//        	}
//        }
//        if(i == s.length())
//        	return true;
//        else
//        	return false;
		if(p.length() == 0)
			return s.length()==0;
		if(p.length()==1 || p.charAt(1)!='*'){
			if(s.length()<1 || (s.charAt(0)!=p.charAt(0) && p.charAt(0)!='.'))
				return false;
			return isMatch(s.substring(1),p.substring(1));
		}else{
			int i =-1;
			while(i<s.length() && (i<0||s.charAt(i)==p.charAt(0)||p.charAt(0)=='.' )){
				if(isMatch(s.substring(i+1),p.substring(2)))
					return true;
				i++;
			}
			return false;
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aa";
		String p = ".*";
		System.out.println(isMatch(s,p));

	}

}

package cn.zp.algo;

public class test {

	/**
	 * @param args
	 */
	static int ViolentMatch(String s, String p)  
	{  
	    int sLen = s.length();  
	    int pLen = p.length();  
	  
	    int i = 0;  
	    int j = 0;  
	    while (i < sLen && j < pLen)  
	    {  
	        if (s.charAt(i) == p.charAt(j))  
	        {  
	            //�������ǰ�ַ�ƥ��ɹ�����S[i] == P[j]������i++��j++      
	            i++;  
	            j++;  
	        }  
	        else  
	        {  
	            //�����ʧ�䣨��S[i]! = P[j]������i = i - (j - 1)��j = 0      
	            i = i - j + 1;  
	            j = 0;  
	        } 
	        
	    }  
	    //ƥ��ɹ�������ģʽ��p���ı���s�е�λ�ã����򷵻�-1  
	    if (j == pLen)  
	        return i - j;  
	    else
	        return -1;  
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcbed";
		String p = "cb";
		
		System.out.println(ViolentMatch(s,p));

	}

}

package cn.zp.leetcode;

public class Zigzag {

	/**
	 * @param args
	 */
	    public static String convert(String s, int nRows) {
	    	String str[] = new String[nRows];
	    	for(int k = 0;k<nRows;k++)
	        	str[k]="";
	        String result = "";
	        int len = s.length();
	        for(int j=0,i=0; ; j=j+2*nRows-2){
	        	if(i>=len)
	        		break;
	        	int m = 0;
	        	for(m =0;m<nRows;m++){
	        		if(i<len)
	        			str[m] = str[m]+s.charAt(i++);
	        		else
	        			break;
	        	}
	        	m--;
        		m--;
	        	for(int n = nRows; n<2*nRows-2;n++){
	        		if(i<len)
	        			str[m]=str[m]+s.charAt(i++);
	        		else
	        			break;
	        		m--;
	        	}
	        }
	        for(int k = 0;k<nRows;k++)
	        	result = result + str[k];
	        return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "PAYPALISHIRING";
		System.out.println(convert(str,4));
	}

}

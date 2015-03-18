package cn.zp.algo;

public class KMP {

	/**
	 * @param args
	 */
	public static int getNext(String s,int[] next){
		if(next.length == 0)
			return 0;
		for(int i=0,j=1;j<s.length()&&i<s.length();){
			if(s.charAt(i) == s.charAt(j)){
				i++;
				next[j] = i;
				j++;
					
			}else if(s.charAt(i) != s.charAt(j)){
				if(i == 0){
					next[j] = 0;
					j++;
				}
				if(i!=0)
					i--;
			}
		}
		for(int k=next.length-1;k>0;k--){
			next[k] = next[k-1];
		}
		next[0] = -1;
		return 0;
	}
	static int KMP(String s,String p){
		int i =0;
		int j =0;
		int next[] = new int[s.length()];
		getNext(s,next);
		while(i<s.length() && j<p.length()){
			if(j==-1 || s.charAt(i)==p.charAt(j)){
				i++;
				j++;
			}else
				j = next[j];
		}
		if(j == p.length())
			return i-j;
		else
			return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "mississippi";
		String p = "issip";
		System.out.println(KMP(s,p));

		
	}

}

package cn.zp.algo;
//��¼ÿ��union���ϵ�Ԫ�ظ�����С���Ϻϲ����󼯺ϣ���֤����ƽ̹
public class QuickUnion2 {
	private int []arr;
	private int []size;
	public QuickUnion2(){
		
	}
	public QuickUnion2(int N){
		arr = new int[N];
		size = new int[N];
		for(int i=0; i<N; i++){
			size[i]=1;
		}
		for(int i=0 ; i<N; i++){
			arr[i] = i;
		}
	}
	public int root(int son){
		while(son!= arr[son]){
			son = arr[son];
		}
		return son;
	}
	public boolean connected(int p,int q){
		return root(p) == root(q);
	}
	public void union(int p,int q){
		int rootp= root(p);
		int rootq = root(q);
		if(rootp == rootq){
			return;
		}else{
			//С�����ӵ�����
			if(size[rootp]<size[rootq]){
				arr[rootp] = rootq;
				size[rootq] += size[rootp];
			}else{
				arr[rootq] = rootp;
				size[rootp] += size[rootq];
			}
		}
	}
}

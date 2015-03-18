package cn.zp.algo;

public class QuickUnion {

	private int []arr;
	public QuickUnion(){
		
	}
	public QuickUnion(int N){
		arr = new int[N];
		for(int i=0 ; i<N; i++){
			arr[i] = i;
		}
	}
	public int root(int son){
		while(son!= arr[son]){
			//����·����⣬������ƽ̹
			arr[son] = arr[arr[son]];
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
		arr[rootp] = rootq;
	}
}

package cn.zp.algo;

import java.util.Scanner;

public class UnionFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UF uf = new UF();
		int arr[] = new int[10];
		uf.init(arr);
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt()){
			int p = scanner.nextInt();
			int q = scanner.nextInt();
			uf.union(arr,p,q);
		}
		System.out.println(uf.connected(arr, 1, 2));

		

	}

}
class UF{
	public void init(int arr[]){
		for(int i=0; i<arr.length; i++){
			arr[i] = i;
		}
	} 
	public boolean connected(int arr[],int p,int q){
		return arr[p] == arr[q];
	}
	public void union(int arr[],int p,int q){
		int pid = arr[p];
		int qid = arr[q];
		for(int i=0; i<arr.length; i++){
			if(arr[i] == pid){
				arr[i] = qid;
			}
		}
	}
	
}

package cn.zp.leetcode2;
import java.util.*;

public class PascalTriangle {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> rows = new ArrayList<List<Integer>>();
		
		if(numRows == 1){
			List<Integer> oneRow = new ArrayList<Integer>();
			oneRow.add(1);
			rows.add(oneRow);
		}else{
			rows=generate(numRows-1);
			List<Integer> oneRow = new ArrayList<Integer>();
			List<Integer> temp =rows.get(numRows-2);
			oneRow.add(1);
			for(int i=0;i<temp.size()-1;i++){
				int e = (Integer)temp.get(i)+(Integer)temp.get(i+1);
				oneRow.add(e);
			}
			oneRow.add(1);
			rows.add(oneRow);
		}
			
		return rows;
    }
	public static void main(String[] args) {
		List<List<Integer>> rows = generate(5);
		for(int i=0;i<rows.size();i++){
			for(int j=0;j<rows.get(i).size();j++)
				System.out.print(rows.get(i).get(j));
			System.out.println();
		}
	}
}

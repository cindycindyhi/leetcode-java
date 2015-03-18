package cn.zp.leetcode;

public class MinimumPathSum {

	/**
	 * @param args
	 */
	public static int minPathSum(int[][] grid) {
		if(grid == null)
			return 0;
		
		for(int i=0;i<grid.length;i++)
			for(int j=0;j<grid[0].length;j++){
				if(i!=0 || j!=0){
					if(i>=1 && j<1)
						grid[i][j]=grid[i-1][j]+grid[i][j];
					else if(j>=1 && i<1)
						grid[i][j]=grid[i][j-1]+grid[i][j];
					else
						grid[i][j]=Math.min(grid[i-1][j]+grid[i][j],grid[i][j-1]+grid[i][j]);
				}
			}

        return grid[grid.length-1][grid[0].length-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a = {{1,2},{1,1}};
		System.out.println(minPathSum(a));
		

	}

}

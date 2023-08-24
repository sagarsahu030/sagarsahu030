package com.example;

import java.util.Arrays;

public class FloodFill {
	 public void dfs(int[][] image,int sr,int sc,int color,int[][] ans,int[] drow,int[] dcol,int iniColor)
	    {
	        ans[sr][sc]=color;
	        int n=image.length;
	        int m=image[0].length;
	        for(int i=0;i<4;i++)
	        {
	            int nrow=sr+drow[i];
	            int ncol=sc+dcol[i];
	            if(nrow>=0&&nrow<n && ncol>=0&&ncol<m && image[nrow][ncol]==iniColor && ans[nrow]  [ncol]!=color)
	            dfs(image,nrow,ncol,color,ans,drow,dcol,iniColor);
	        }
	    }
	    {

	    }
	    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
	        int n=image.length;
	        int m=image[0].length;
	        int[][] ans=Arrays.stream(image).map(int[]::clone).toArray(int[][]::new);
	        int iniColor=image[sr][sc];
	        // Arrays.stream(image).map(int[]::clone).toArray(int[][]::new);
	        int[] drow={-1,0,1,0};
	        int[] dcol={0,-1,0,1} ;
	        dfs(image,sr,sc,color,ans,drow,dcol,iniColor);
	        return ans;
	    }

}

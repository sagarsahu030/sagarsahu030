package com.example;
import java.util.*;
public class example2 {
	public static void main(String...args)
	{
	int[][] image= {{1,2,3},{2,1,3},{1,0,1}};
	int[][] ans= Arrays.stream(image).map(int[]::clone).toArray(int[][]::new);
	System.out.println(ans.length);
	}
	 

}

package com.example;


import java.util.HashMap;
import java.util.Map;

//find the frequency of characters in a string
public class Example1 {
	public static void frequency(String s)
	{
		Map<Character, Integer> resultMap=new HashMap<Character, Integer>();
		
//		store all the character and their frequency in the resultMap
		for(int i=0;i<s.length();i++)
		{
			if(resultMap.containsKey(s.charAt(i)))
			{
				resultMap.put(s.charAt(i), resultMap.get(s.charAt(i))+1);
			}
			else {
				resultMap.put(s.charAt(i), 1);
			}
		}
		for(Character c:resultMap.keySet())
		{
			System.out.println(c);
		}
//		System.out.print(resultMap.get(s.charAt(0)));
		for(int i=0;i<s.length();i++)
		{
			if(resultMap.get(s.charAt(i))!=0)
			{
				 System.out.print(s.charAt(i));
				 System.out.print(resultMap.get(s.charAt(i))+" ");
				 resultMap.put(s.charAt(i), 0);
				
			}
		}
		
	}
	public static void main(String[] args)
	{
		frequency("sagarsahu");
		long[][] dp=new long[2][3];
		dp[0][0]=-5;
		System.out.print(dp[0][0]);
	}

}
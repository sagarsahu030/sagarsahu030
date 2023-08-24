package com.example;

import java.util.*;

public class DFS {
	private LinkedList<Integer> adjIntegers[];
	int v;
	DFS(int v)
	{
		this.v=v;
		adjIntegers=new LinkedList[v];
		
		for(int i=0;i<v;i++)
		{
			adjIntegers[i]=new LinkedList<Integer>();
		}
	}
	void addEdge(int v, int w) { adjIntegers[v].add(w); }

	public void dfsSearch(int node,boolean[] visited)
	{
//		 boolean visited[]=new boolean[v];
//		 
		 List<Integer> list=new LinkedList<Integer>();
		 visited[node]=true;
		 System.out.println(node+" ");
		 list.add(node);
		 Iterator<Integer> iterator=adjIntegers[node].iterator();
		 while(iterator.hasNext())
		 {
			 int s=iterator.next();
			 if(!visited[s])
			 {
				 dfsSearch(s, visited);
				 
			 }
		 }
	}
	 public static void main(String args[])
	    {
		 boolean[] visitedBooleans=new boolean[9];
	        DFS g = new DFS(4);
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	 
	        System.out.println(
	            "Following is Breadth First Traversal "
	            + "(starting from vertex 0)");
	 
	        g.dfsSearch(0,visitedBooleans);
	    }

}

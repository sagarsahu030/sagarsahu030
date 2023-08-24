package com.example;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
	private LinkedList<Integer> adjIntegers[];
	int v;
	BFS(int v)
	{
		this.v=v;
		adjIntegers=new LinkedList[v];
		
		for(int i=0;i<v;i++)
		{
			adjIntegers[i]=new LinkedList<Integer>();
		}
	}
	void addEdge(int v, int w) { adjIntegers[v].add(w); }
	
	 void BFS(int s)
	 {
		 
		 boolean visited[]=new boolean[v];
//		 make a queue to store the node of graph
		 LinkedList<Integer> queue=new LinkedList<Integer>();
		 
//		 make starting node as true
		 visited[s]=true;
		 queue.add(s);
		 while(!queue.isEmpty())
		 {
			 int node=queue.poll();
			 System.out.print(node+" ");
			 Iterator<Integer> iterator=adjIntegers[s].iterator();
			 while(iterator.hasNext())
			 {
				 int n=iterator.next();
				 if(!visited[n])
				 {
					 visited[n] = true;
	                    queue.add(n);
				 }
			 }
		 }
		 
	 }
	 public static void main(String args[])
	    {
	        BFS g = new BFS(4);
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	 
	        System.out.println(
	            "Following is Breadth First Traversal "
	            + "(starting from vertex 2)");
	 
	        g.BFS(2);
	    }
	}


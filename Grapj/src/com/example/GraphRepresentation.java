package com.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphRepresentation {

	private LinkedList<Integer> list[];

//	public GraphRepresentation(int v) {
//		
//		
//	}
	static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	public static void main(String...args)
	{
		ArrayList<ArrayList<Integer>> adjArrayList=new ArrayList<ArrayList<Integer>>();
		int v=5;
		for (int i = 0; i < v; i++)
			adjArrayList.add(new ArrayList<Integer>());
		addEdge(adjArrayList, 0, 1);
		addEdge(adjArrayList, 0, 2);
		addEdge(adjArrayList, 1, 2);
		addEdge(adjArrayList, 1, 3);
		addEdge(adjArrayList, 2, 4);
		addEdge(adjArrayList, 3, 4);
	System.out.print(adjArrayList.get(0).get(0));
		
		
	}
	
	
}

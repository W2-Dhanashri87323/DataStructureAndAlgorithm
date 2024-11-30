package com.sunbeam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Graph {
	private int vertexcount;
	private int edgecount;
	private boolean adjmatrix[][];

	public Graph(int v) {
		this.vertexcount = v;
		adjmatrix = new boolean[vertexcount][vertexcount];
	}

	public void accept(Scanner sc) {
		System.out.print("Enter the edge count: ");
		edgecount = sc.nextInt();

		System.out.println("Enter edges,(src)(dest) :");
		for (int i = 0; i < edgecount; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adjmatrix[src][dest] = true;
			adjmatrix[dest][src] = true;
		}
	}

	public void print() {
		System.out.println("Graph : ");
		for (int i = 0; i < vertexcount; i++) {
			for (int j = 0; j < vertexcount; j++) {
				System.out.print(adjmatrix[i][j] ? "1 " : "0 ");
			}
			System.out.println();
		}
	}

	public void SSSPAlgorithm(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		boolean marked[] = new boolean[vertexcount];
		
		q.offer(start);
		
		marked[start]=true;
		
		System.out.println("single source shortest path : ");
		
		int length[] = new int[start];
		length[start] = 0;
		
		
		length[start] = length[start] + 1;

		
		while(!q.isEmpty()) {
			int u = q.poll();
			length[u] = 1;
			
			for(int v =0; v<vertexcount;v++) {
				q.offer(v);
				marked[v]=true;
				
				System.out.println(length[v]);
			
			}

		}

	}

}

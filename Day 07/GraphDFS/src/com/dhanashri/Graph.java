package com.dhanashri;

import java.util.Scanner;
import java.util.Stack;

public class Graph {
	private int vertexcount, edgecount;

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

	public void DFSTraversal(int start) {
		Stack<Integer> st = new Stack<Integer>();
		boolean marked[] = new boolean[vertexcount];

		st.push(start);
		marked[start] = true;

		while (!st.isEmpty()) {
			int u = st.pop();
			System.out.println(" " + u);

			for (int v = 0; v < vertexcount; v++) {
				if (!marked[v] && adjmatrix[u][v]) {
					st.push(v);
					marked[v] = true;

				}
			}
		}

	}
}

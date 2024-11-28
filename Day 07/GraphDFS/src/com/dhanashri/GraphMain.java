package com.dhanashri;

import java.util.Scanner;

public class GraphMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter vertex count : ");
		
		int v = sc.nextInt();
		
		Graph g = new Graph(v);
		
		g.accept(sc);
		
		g.DFSTraversal(0);

	}

}

package com.dhanashri;

import java.util.Scanner;

public class GrapMain {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the vertex count:");
		
		int v = sc.nextInt();
		
		Graph g = new Graph(v);
		g.accept(sc);
		g.print();
		
		sc.close();
		
		
	}

}

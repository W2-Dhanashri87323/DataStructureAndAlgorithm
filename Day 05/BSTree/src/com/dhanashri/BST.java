package com.dhanashri;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {

	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}
	}

	private Node root;

	public BST() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(int value) {
		// create a newnode
		Node newnode = new Node(value);
		// if bst is empty or root is empty
		if (root == null) {
			// add newnode into root itself
			root = newnode;
		}

		else {
			// create trav reference and start at root
			Node trav = root;
			while (true) {

				if (value < trav.data) {
					if (trav.left == null) {
						trav.left = newnode;
						break;

					} else {
						trav = trav.left;
					}
				}

				else {
					if (value > trav.data) {
						if (trav.right == null) {
							trav.right = newnode;
							break;
						} else {
							trav = trav.right;
						}
					}
				}

			}

		}

	}

	private void preorder(Node trav) {
		if (trav == null)
			return;
		System.out.println(" " + trav.data); // V
		preorder(trav.left); // L
		preorder(trav.right); // R

	}

	public void preorder() { // wrapper method
		System.out.println("Preorder: ");
		preorder(root);
		System.out.println();
	}

	private void inorder(Node trav) {
		if (trav == null)
			return;
		inorder(trav.left); // L
		System.out.println(" " + trav.data); // v
		inorder(trav.right); // R
	}

	public void inorder() {
		System.out.println("Inorder : ");
		inorder(root);
		System.out.println();
	}

	private void postorder(Node trav) {
		if (trav == null)
			return;
		postorder(trav.left); // L
		postorder(trav.right); // R
		System.out.println(" " + trav.data); // V
	}

	public void postorder() {
		System.out.println("Postorder : ");
		postorder(root);
		System.out.println();
	}

	public void DFStraversal() { // using stack

		Stack<Node> st = new Stack<BST.Node>();

		st.push(root);

		System.out.println("DFS Traversal : ");
		while (!st.isEmpty()) {

			Node trav = st.pop();

			System.out.println(" " + trav.data);

			if (trav.right != null) {
				st.push(trav.right);
			}
			if (trav.left != null) {
				st.push(trav.left);
			}

		}

		System.out.println();
	}

	public void BFStravresal() { // using Queue

		Queue<Node> q = new LinkedList<BST.Node>();

		q.offer(root);

		System.out.println("BFSTraversal : ");
		while (!q.isEmpty()) {
			Node trav = q.poll();
			
			System.out.println(" " +trav.data);

			if (trav.left != null) {
				q.offer(trav.left);
			}
			if (trav.right != null) {
				q.offer(trav.right);
			}

		}
		System.out.println();

	}

}

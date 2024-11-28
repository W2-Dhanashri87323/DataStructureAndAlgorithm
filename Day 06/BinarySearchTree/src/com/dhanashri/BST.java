package com.dhanashri;

public class BST {
	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int value) {
			this.data = value;
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
		Node newnode = new Node(value);

		if (root == null)
			root = newnode;
		else {
			Node trav = root;
			while (true) {
				if (value < trav.data) {
					if (trav.left == null) {
						trav.left = newnode;
						break;
					} else {
						trav = trav.left;
					}
				} else {
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

	private void preorder(Node trav) {
		if (trav == null)
			return;
		System.out.print(" " + trav.data); // v
		preorder(trav.left); // L
		preorder(trav.right); // R
	}

	public void preorder() {
		System.out.print("PreOrder Traversal :: ");
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
		System.out.print("InOrder Traversal :: ");
		inorder(root);
		System.out.println();
	}

	private void postorder(Node trav) {
		if (trav == null)
			return;
		postorder(trav.left); // L
		postorder(trav.right); // R
		System.out.println(" " + trav.data); // v
	}

	public void postorder() {
		System.out.print("postorder Traversal :: ");
		postorder(root);
		System.out.println();
	}

	public void BinarySearch(int value) {
		Node node = BinarySearchImpl(value, root);
		if (node != null) {
			System.out.println("Element is found");
		} else {
			System.out.println("Element is not found");
		}

	}

	private Node BinarySearchImpl(int value, Node trav) {
		if (trav == null)
			return null;
		if (trav.data == value) {
			return trav;
		}
		if (value < trav.data) {
			return BinarySearchImpl(value, trav.left);
		} else {
			return BinarySearchImpl(value, trav.right);
		}
	}

	public Node[] BinarySearchWithParent(int key) {
		Node trav = root;
		Node parent = null;
		while (trav != null) {
			if (key == trav.data)
				break;
			parent = trav;
			if (key < trav.data)
				trav = trav.left;
			else
				trav = trav.right;
		}

		if (trav == null)
			parent = null;

		Node arr[] = new Node[] { trav, parent };
		return arr;

	}

	public void deleteNode(int key) {

		Node arr[] = BinarySearchWithParent(key);
		Node trav = arr[0], parent = arr[1];

		// if node is not found
		if (trav == null) {
			return;
		}

		// if node is having two childs
		if (trav.left != null && trav.right != null) {
			// find predecessor
			Node pred = trav.left;// one left
			parent = trav;
			while (pred.right != null) {// extreme right
				parent = pred;
				pred = pred.right;
			}
			trav.data = pred.data;
			trav = pred;

			// if node is root node for single right child
			if (trav.left == null) {
				if (trav == root) {
					root = trav.right;
				} else if (trav == parent.left) {
					parent.left = trav.right;
				} else if (trav == parent.right) {
					parent.right = trav.right;
				}
			}

			// if node is having single left child
			if (trav.right == null) {
				if (trav == root)
					root = trav.left;
				else if (trav == parent.left)
					parent.left = trav.left;
				else if (trav == parent.right)
					parent.right = trav.left;
			}

		}

	}
	
	public int height (Node trav) {
		if(trav==null)
			return -1;
		
	}
}

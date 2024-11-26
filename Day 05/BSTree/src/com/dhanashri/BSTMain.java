package com.dhanashri;

public class BSTMain {
	public static void main(String[] args) {
		BST bst = new BST();
		bst.addNode(10);
		bst.addNode(8);
		bst.addNode(25);
		bst.addNode(20);
		bst.addNode(6);
		
		bst.preorder();
		bst.inorder();
		bst.postorder();
		
		bst.DFStraversal();
		bst.BFStravresal();
		
		
	}

}

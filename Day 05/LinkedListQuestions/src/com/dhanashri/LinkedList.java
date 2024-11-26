package com.dhanashri;

import com.dhanashri.LinkedList.Node;

public class LinkedList {
	static class Node {
		int data;
		Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;

	public LinkedList() {
		head = null;
	}

	public boolean inEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		// 1.create a new node
		Node newnode = new Node(value);
		// 2.assign newnode.next to head value i.e null
		newnode.next = head;
		// 3.add newnode into head;
		head = newnode; // newnode.data
	}

	public void addLast(int value) {
		Node newnode = new Node(value);

		if (head == null) {
			head = newnode;
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = newnode;
		}
	}

	public void displayList() {
		Node trav = head;

		while (trav != null) {

			System.out.println(trav.data);

			trav = trav.next;
		}

		System.out.println();
	}

	public void addPosition(int value, int pos) {
		// create new node
		Node newnode = new Node(value);

		if (head == null) {
			head = newnode;
		} else if (pos <= 1) {
			addFirst(value);
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1 && trav.next != null; i++) { // for even number of elements
				trav = trav.next;
				newnode.next = trav.next;
				trav.next = newnode;
			}
		}
	}

	public void deleteFirst() {
		if (head == null) {
			return;
		}

		head = head.next;
	}

	public void deleteLast() {

		if (head == null) {
			return;
		} else if (head.next == null) {
			head = null;

		} else {
			Node trav = head;
			while (trav.next.next != null) {
				trav = trav.next;
			}
			trav.next = null;
		}

	}

	public void deletePosition(int position) {

		if (head == null) {
			return;
		} else if (head.next == null) {
			head = null;
		} else if (position <= 1) {
			deleteFirst();
		} else {
			Node trav = head;
			for (int i = 1; i < position - 1 && trav.next.next != null; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
	}

	private void displayReverse(Node trav) {

		if (trav == null)
			return;
		displayReverse(trav.next);
		System.out.println(trav.data);
	}

	public void displayReverse() {
		Node trav = head;
		displayReverse(trav);
	}

}

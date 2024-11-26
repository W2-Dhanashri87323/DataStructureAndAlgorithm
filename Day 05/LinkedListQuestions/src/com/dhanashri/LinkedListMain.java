package com.dhanashri;

import com.dhanashri.LinkedList.Node;

public class LinkedListMain {
	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		
		//list.addLast(80);
		//list.addPosition(100, 4);
		//list.deleteFirst();
		//list.deleteLast();
		//list.deletePosition(3);
		
		list.displayReverse();
		
		list.displayList();
	}
}

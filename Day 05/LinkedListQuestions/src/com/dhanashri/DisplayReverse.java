package com.dhanashri;

import com.dhanashri.LinkedList.Node;

public class DisplayReverse {
	//using recursion
	public void displayReverse(Node trav) {
		
		if(trav==null)
			return;
		displayReverse(trav.next);
		System.out.println(trav.data);		
	}
	

}

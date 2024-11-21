package com.dhanashri;

import java.util.Scanner;

//search the element that user have entered -->
public class LinearSearchProgram {
	public static void main(String[] args) {
		int arr[] = { 88, 33, 66, 99, 11, 77, 22, 55, 14 };

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element for search : ");
		int element = sc.nextInt();

		int index = linearSearchFun(arr, element);
		if (index == -1) {
			System.out.println("Element is not found..");
			
	 	}else {
	 		System.out.println("Element is found at index : " + index);
	 	}

	}

	public static int linearSearchFun(int arr[], int element) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (element == arr[i]) {
				return i;
			}
		}

		return -1;
	}

}

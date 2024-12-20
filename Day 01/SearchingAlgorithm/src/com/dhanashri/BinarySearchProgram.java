package com.dhanashri;

import java.util.Scanner;

//find the element using binarysort (used when array is sorted)-->
public class BinarySearchProgram {
	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		
		int left = 0;
		int right = arr.length - 1;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element for search :");
		int element = sc.nextInt();

		int index = binarySearchFun(arr, element,left,right);
		if (index == -1) {
			System.out.println("element not found");
		} else {
			System.out.println("element found at index : " + index);
		}

	}

	// iterative appoarch
	public static int binarySearchFun(int arr[], int element) {

		int left = 0;
		int right = arr.length - 1;

		// valid partition -->
		while (left <= right) {
			// find the mid
			int mid = (left + right) / 2;

			if (element == arr[mid]) {
				return mid;
			}
			if (element < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

	// recursive appoarch

	public static int binarySearchFun(int arr[], int element, int left, int right) {
		// stop if partition is invalid
		if (left > right)
			return -1;
		// 2. find middle element of array
		int mid = (left + right) / 2;
		// 3. compare key with middle element
		if (element  == arr[mid])
			// 4. if key is matching, return mid
			return mid;
		// 5. if key is less than middle element, then search it into left partition
		if (element < arr[mid])
			return binarySearchFun(arr, element, left, mid - 1);
		// 6. if key is greater than middle element, then search it into right partition
		else
			return binarySearchFun(arr, element, mid + 1, right);

	}

}

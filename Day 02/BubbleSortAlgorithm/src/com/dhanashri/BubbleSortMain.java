package com.dhanashri;

import java.util.Arrays;

public class BubbleSortMain {
	public static void main(String[] args) {
		int arr[] = { 33, 22, 66, 55, 44, 11 };

		System.out.println("Array before sorting :" + Arrays.toString(arr));

		bubbleSort(arr, arr.length);

		System.out.println("Array after sorting :" + Arrays.toString(arr));

	}

	public static void bubbleSort(int arr[], int length) {
		for (int i = 1; i < length; i++) {
			System.out.println("================PASS " + i + "==============");
			for (int j = 0; j < length - i; j++) {

				if (arr[j] > arr[j + 1]) {
 
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				System.out.println("Array :: " + Arrays.toString(arr));
			}

		}

	}

}

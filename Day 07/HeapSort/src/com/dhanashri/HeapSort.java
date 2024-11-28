package com.dhanashri;

public class HeapSort {
	private int SIZE;

	public HeapSort() {
		SIZE = 0;
	}
	
	public void createHeap(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			SIZE++;
			int ci = SIZE;
			int pi = ci / 2;
			if (pi > ci)
				break;
			while (pi >= 1) {
				int temp = arr[pi];
				arr[pi] = arr[ci];
				arr[ci] = temp;
				ci = pi;
				pi = ci / 2;
			}
		}
	}

	public void deleteAllHeap(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int max = arr[1];
			arr[1] = arr[SIZE];
			arr[SIZE] = max;
			SIZE--;
			int pi = arr[i];
			int ci = pi * 2;

			while (ci <= SIZE) {
				if (arr[ci + 1] > arr[ci]) {
					ci = ci + 1;
				}
				if (pi > ci)
					break;
				int temp = arr[pi];
				arr[pi] = arr[ci];
				arr[ci] = temp;
				pi = ci;
				ci = pi * 2;	
			}
		}
	}
	
	public void heapSort(int arr[]) {
		createHeap(arr);
		deleteAllHeap(arr);	
	}
}












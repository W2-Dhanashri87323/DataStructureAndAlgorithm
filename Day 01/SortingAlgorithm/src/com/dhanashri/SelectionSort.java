package com.dhanashri;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
	  int arr[]= {44,11,55,22,66,33};
	  System.out.println("Array before sorting : "+ Arrays.toString(arr));
	  
	  int n = arr.length;
	  selectionSortFun(arr,n);
	  
	  System.out.println("Arrays after sort : " + Arrays.toString(arr));
		
		
	}
	
	public static void selectionSortFun(int arr[],int n) {
		//1.select on postion of the array (repeat N-1 times)
		for(int i =0;i<n-1;i++){
			//2.find min element from remaining
			int minIndex =i;
			
			for(int j =i+1;j<n;j++) {
				if(arr[j]< arr[minIndex]) {
					minIndex=j;
				}
			}
			//3. swap selected position element and min element
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex]=temp;			
		}
		
		
	}
	

}

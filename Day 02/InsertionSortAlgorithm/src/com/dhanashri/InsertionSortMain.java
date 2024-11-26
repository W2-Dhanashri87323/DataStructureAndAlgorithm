package com.dhanashri;

import java.util.Arrays;

public class InsertionSortMain {
	public static void main(String[] args) {
		int arr[] = { 55, 44, 22, 66, 11, 33 };

		System.out.println("Array before sorting : " + Arrays.toString(arr));
		
		insertionSortFun(arr,arr.length);
  	}
	
	public static void insertionSortFun(int arr[],int length) {
		for(int i =1;i<arr.length;i++) {
			int temp = arr[i];
			int j ;
			for(j=i-1;j>=0;j--) {
				if(arr[j]>temp) {
					arr[j+1]= arr[j];
				}else {
					break;//to not move element
				}	
			}
		
			
			
			
			
			
		}
		
		
		
	}

}

package com.collection;

import java.util.Arrays;

public class ArraysImpl {

	public static void main(String args[]) {
	int [] arr=new int[10];
	
	for(int i=0;i<9;i++)
		arr[i]=i;
	System.out.println(Arrays.binarySearch(arr,3));// return index of the given number
	System.out.println(Arrays.binarySearch(arr,19));// return insertion point
	}
}

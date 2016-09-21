package com.sorting.comparison.algorithms;

import java.io.IOException;
import java.util.Arrays;

import com.util.CormenUtil;

public class BasicSorting {

	public static void main (String [] args) throws IOException {
		
	}
	
	public static void selectionSort() throws IOException {
		int A[] = CormenUtil.takeInputs();
		int n = A.length;
		
		for (int j = 0; j < n-1; j++) {
			int smallest = j;
			for (int i = j+1; i < n; i++) {
				if (A[i] < A[smallest]) {
					smallest = i;
				}
			}
			int temp = A[j];
			A[j] = A[smallest];
			A[smallest] = temp;
		}
		
		
		System.out.println("Sorted sequence: " + Arrays.toString(A));
	}
	
	public static void insertionSort() throws IOException {
		int A[] = CormenUtil.takeInputs();
		int n = A.length;
		
		for (int j = 1; j < n; j++) {
			int key = A[j];
			int i = j-1;
			while (i >= 0 && A[i] > key) {
				A[i + 1] = A[i];
				i = i-1;
			}
			A[i+1] = key;
		}
		System.out.println("Sorted sequence: " + Arrays.toString(A));	
	}
}

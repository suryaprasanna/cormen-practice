package com.sorting.comparison.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertionSort {

	public static void main(String [] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Select the value of n: ");
		int n = Integer.parseInt(bf.readLine());
		
		System.out.print("Input sequence : ");
		String inputString = bf.readLine();
		int A[] = extractArrayOfInts(inputString);
		
		if (A.length != n) {
			n = A.length;
		}
		
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
	
	static int[] extractArrayOfInts(String s) {
		
		String [] p = s.split(" ");
		int[] r = new int[p.length];
		for (int i =0; i< p.length; i++){
			r[i] = Integer.parseInt(p[i]);
		}
		return r;
	}
	
}

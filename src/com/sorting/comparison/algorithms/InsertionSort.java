package com.sorting.comparison.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertionSort {
	
	public static void main(String [] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Select the value of n: ");
		int n = bf.read();
		
		int a[] = new int[n];
		
		String inputString = bf.readLine();
		
		
		
	}
	
	static int[] extractArrayOfInts(String s, int n) {
		
		int[] r = new int[n];
		
		String [] p = s.split(" ");
		for (int i =0; i< p.length; i++){
			r[i] = Integer.parseInt(p[i]);
		}
		return r;
	}

}

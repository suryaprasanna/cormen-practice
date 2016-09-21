package com.sorting.comparison.algorithms;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

import com.util.CormenUtil;

public class QuickSort {

	public static void main(String [] args) throws IOException {
		
		int A[] = CormenUtil.takeInputs();
		randomizedQuickSort(A, 0, A.length-1);
		System.out.println(Arrays.toString(A));
	}
	
	public static void randomizedQuickSort(int a[], int p, int r) {
		if (p < r) {
			int q = randomPartition(a, p, r);
			randomizedQuickSort(a, p, q-1);
			randomizedQuickSort(a, q + 1, r);
		}
	}
	
	public static void quickSort(int a[], int p, int r) {
		if (p < r) {
			int q = partition(a, p, r);
			quickSort(a, p, q-1);
			quickSort(a, q + 1, r);
		}
	}
	
	public static int randomPartition(int a[], int p, int r) {
		
		Random rand = new Random();
		int q = p + rand.nextInt((r-p)+1);
		int t = a[q];
		a[q] = a[r];
		a[r] = t;
		return partition(a, p, r);
	}
	
	public static int partition(int a[], int p, int r) {
		
		int key = a[r];
		int index = p -1;
		for (int i = p; i < r ; i++) {
			if (a[i] < key) {
				index++;
				int t = a[i];
				a[i] = a[index];
				a[index] = t;
			}
		}
		index++;
		int t = a[index];
		a[index] = a[r];
		a[r] = t;
		return index;
	}
	
}

package com.sorting.comparison.algorithms;

import java.io.IOException;
import java.util.Arrays;

import com.util.CormenUtil;

public class MergeSort {

	public static void main(String [] args) throws IOException {
		
		int A[] = CormenUtil.takeInputs();
		mergeSort(A, 0, A.length-1);
		System.out.println(Arrays.toString(A));
	}
	
	public static void mergeSort(int a[], int p, int r) {
		if (p < r) {
			int q = (p + r)/2;
			mergeSort(a, p, q);
			mergeSort(a, q + 1, r);
			merge(a, p, q, r);
		}
	}

	public static void merge(int a[], int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		
		int left[] = new int[n1];
		int right[] = new int[n2];
		
		for (int i = 0; i < n1; i++) {
			left[i] = a[p+i];
		}
		for (int i = 0; i < n2; i++) {
			right[i] = a[q+1+i];
		}
		
		int i = 0, j = 0, k =p;
		while(k < r && i < n1 && j < n2) {
			if (left[i] < right[j]) {
				a[k] = left[i];
				i++;
			} else {
				a[k] = right[j];
				j++;
			}
			k++;
		}
		if (i == n1) {
			while(j<n2) {
				a[k] = right[j];
				j++;
				k++;
			}
		}
		if (j == n2) {
			while(i<n1) {
				a[k] = left[i];
				i++;
				k++;
			}
		}
	}
}

package com.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CormenUtil {

	public static int[] takeInputs() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input sequence : ");
		String inputString = bf.readLine();
		return extractArrayOfInts(inputString);
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

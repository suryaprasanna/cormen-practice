package com.dynamic.programming;

import java.util.Scanner;

/**
 * Created by Surya on 9/23/2016.
 */
public class LongestCommonSequence {

    public static void main(String [] args) {

        naiveAlgorithm();

    }

    public static void optimized() {
        Scanner scanner = new Scanner(System.in);

        char [] x = (" " + scanner.nextLine()).toCharArray();
        char [] y = (" " + scanner.nextLine()).toCharArray();

        int m = x.length;
        int n = y.length;

//        char [][] b = new char[m][];
//        int [][] c = new int[m][n];
//
//        for (int i = 0; i < m; i++) {
//            c[i][0] = 0;
//        }
//        for (int i = 0; i < n; i++) {
//            c[0][i] = 0;
//        }

        //taken n < m
        int [] [] c = new int[n][2];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = 0;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                if (x[i] == y[j]) {
                    c[j][0] = 1 + c[i - 1][j - 1];
                } else if () {

                } else {

                }
            }
        }
    }


    public static void naiveAlgorithm() {
        Scanner scanner = new Scanner(System.in);

        char [] x = (" " + scanner.nextLine()).toCharArray();
        char [] y = (" " + scanner.nextLine()).toCharArray();

        int m = x.length;
        int n = y.length;

        char [][] b = new char[m][];
        int [][] c = new int[m][n];

        for (int i = 0; i < m; i++) {
            c[i][0] = 0;
        }
        for (int i = 0; i < n; i++) {
            c[0][i] = 0;
        }

        for (int i = 1; i<m; i++) {

            for(int j=1; j<n; j++) {

                if (x[i] == y[j]) {
                    c[i][j] = 1 + c[i-1][j-1];
                } else if (c[i-1][j] > c[i][j-1] ) {
                    c[i][j] = c[i-1][j];
                } else {
                    c[i][j] = c[i][j-1];
                }

            }

        }

        System.out.println(c[m-1][n-1]);







    }


}

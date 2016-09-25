package com.dynamic.programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Surya on 9/24/2016.
 */
public class MonotonicIncSubSeq {

    public static void main(String [] args) {


        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        String[] sArr = s.trim().split("\\s+");

        int n = sArr.length;
        int [] arr = new int[n];

        for (int i =0; i < n; i++) {
            arr[i] = Integer.parseInt(sArr[i]);
        }

        List<Integer> currArr = new ArrayList<>();
        currArr.add(arr[0]);

        for (int i=1; i< arr.length; i++) {

            if (arr[i] >= arr[currArr.get(currArr.size()-1)]) {
                currArr.add(arr[i]);
            } else if (arr[i] >= arr[currArr.get(currArr.size()-2)]){



            }

        }


    }

}

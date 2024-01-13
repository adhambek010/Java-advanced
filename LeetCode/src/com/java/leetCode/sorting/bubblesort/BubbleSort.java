package com.java.leetCode.sorting.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        long start = System.currentTimeMillis();
        for(int i = n - 1;  i >= 0; i--){
            for(int j = 0; j <= i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        long end = System.currentTimeMillis();

        System.out.println(Arrays.toString(arr));
        System.out.println("Time taken " + (end-start));
    }
}

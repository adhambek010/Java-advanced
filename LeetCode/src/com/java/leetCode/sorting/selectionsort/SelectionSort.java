package com.java.leetCode.sorting.selectionsort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {13, 46, 24, 52, 20, 9};

        int n = array.length;
        for(int i = 0; i < n-1; i++){
            for (int j = i; j < n; j++){
                int temp = array[i];
                if (array[i] > array[j]){
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(sort2(array)));
    }
    public static int[] sort2(int[] arr){
        for(int i = 0; i < arr.length-1;i++){
            int mini = i;
            for(int j = i; j < arr.length; j++){
                if (arr[j] < arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}

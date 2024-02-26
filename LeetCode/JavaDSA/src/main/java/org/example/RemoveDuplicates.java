package org.example;


import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};
        removeDuplicatesOptimal(array);
    }
    private static HashSet<Integer> removeDuplicatesBrute(int[] array){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i : array){
            hashSet.add(i);
        }
        return hashSet;
    }
    private static void removeDuplicatesOptimal(int[] array){
        int i = 0;
        for(int j = 1; j < array.length; j++){
            if(array[j] != array[i]){
                array[i+1] = array[j];
                i++;
            }
        }
        for(int m : array){
            System.out.println(m);
        }
    }
}
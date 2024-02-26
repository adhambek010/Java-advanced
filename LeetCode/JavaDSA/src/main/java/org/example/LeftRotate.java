package org.example;

public class LeftRotate {
    public static void main(String[] args) {
        int[] array = {13, 46, 52, 20, 9, 24};
        leftRec(array, 3);

    }

    private static void leftRec(int[] array, int d){
        reverse(array,0, d);
        reverse(array, d, array.length-1);
        reverse(array, 0, array.length-1);

        for(int i : array){
            System.out.print(i + "\t");
        }
    }
    private static void reverse(int[] array, int start, int end){
        while (start <= end){
            int temp = array[start];
            array[start] = array[end];
            ++start;
            --end;
        }
    }

    private static void leftRotateByN(int[] array, int n){
        n %= array.length;
        int[] tempArray = new int[n];
        System.arraycopy(array, 0, tempArray, 0, n);
        int k = 0;
        for(int i = n; i < array.length; ++i){
            array[i-n] = array[i];
        }
        if (array.length - (array.length - n) >= 0)
            System.arraycopy(tempArray, 0, array, array.length - n, array.length - (array.length - n));
        for (int i : array){
            System.out.print(i+"\t");
        }

    }
    private static int[] leftRotateBy1(int[] array){
        int temp = array[0];
        for(int i = 1; i < array.length; i++){
            array[i - 1] = array[i];
        }
        array[array.length-1] = temp;
        return  array;
    }
}

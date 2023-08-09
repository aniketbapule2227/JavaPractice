package com.array;

public class RotateArrayElements {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = 3;//it determines how many times have to rotate the array.

        // display the original Array
        System.out.println("Original Array");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();

        //store the first element of array.
        for (int i = 0; i < n; i++) {
            int first = arr[0];
            int j;
            for ( j = 0; j < arr.length - 1; j++) {
                arr[j]=arr[j + 1];
            }
            //first array element added to the end.
            arr[j]=first;
        }
        //array after rotation.
    System.out.println("Modifies Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }
}

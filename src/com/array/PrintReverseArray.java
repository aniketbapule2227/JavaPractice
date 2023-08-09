package com.array;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.asList;

public class PrintReverseArray {
    public static void main(String[] args) {
        Integer[] arr={4,5,21,45,78,6};

        Collections.reverse(Arrays.asList(arr));
        System.out.print(Arrays.asList(arr));
//        for(int i : arr){
//            System.out.print(" "+i);


//        }
    }
}

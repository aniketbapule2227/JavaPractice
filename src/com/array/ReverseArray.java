package com.array;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

    public static void reverse(Integer a[]){
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));


    }

    public static void main(String[] args) {
        Integer[] arr={5,2,4,7,5,5};
        reverse(arr);
        System.out.print("Hello github");
    }

}

package com.array;
//Java Program to copy all elements of one array into another array.
public class CopyAllElement {
    public static void copyArray(){
        int array[]={5,7,9,6,24};
        int array2[]=array;

        for(int a : array2){
            System.out.print(" "+a);
        }

    }

    public static void main(String[] args) {

        CopyAllElement.copyArray();

    }


}

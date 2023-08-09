package com.array;
//java program to find duplicate.
public class FindDuplicate {

    public static void main(String[] args) {

        int[] array={1,5,7,6,4,5,8,3,4,1};

        for (int i=0;i<array.length-1;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){

                    System.out.print(" "+array[i]);

                }
            }
        }
    }
}

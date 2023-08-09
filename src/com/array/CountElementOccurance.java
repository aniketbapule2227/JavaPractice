package com.array;

public class CountElementOccurance {

    public static void main(String[] args) {
        int[] arr ={1,5,4,8,1,4,2,4,1,5,3,5,8};
        int[] arr2= new int[arr.length];
        int visit=-1;

        for(int i=0;i<arr.length;i++){
          int  count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr2[j]=visit;
                }

            }
            if(arr2[i]!=visit){
                arr2[i]=count;
            }
        }
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 0; i < arr2.length; i++){
            if(arr2[i] != visit)
                System.out.println("    " + arr[i] + "    |    " + arr2[i]);
        }

    }
}

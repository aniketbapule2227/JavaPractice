package com.java;

import java.util.Scanner;

public class PrimeNumber {
    static  int count;
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();

        if(number>=0){
            for(int i=1;i<=number;i++){
                if(number%i==0){

                    count++;
                }
            }
            if(count==2){
                System.out.println("Number is prime number =="+number);

            }else {
                System.out.println("number is not prime=="+number);
            }

        }
    }
}

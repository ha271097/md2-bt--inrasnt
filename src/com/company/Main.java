package com.company;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

//        System.out.println("Enter number");
//        Scanner sc= new Scanner(System.in);
//        int num =sc.nextInt();
        boolean checking=true;
        for(int num = 0 ; num<=20 ; num++) {
            if(num == 1 || num == 2){
                System.out.println(num);
            }
            else if(num<=0){
                continue;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    checking = false;
                }
                if(checking){
                    System.out.println(num);
                }
                else {
                    continue;
                }
            }
        }
    }
}

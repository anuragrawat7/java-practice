package main.java.javaCode;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
        * Reverse of a number
        */

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int num = input.nextInt();
//        //int num = 54321;
//        int ans = 0;
//
//        while (num > 0){
//            int rem = num % 10;
//            num /= 10;
//
//            ans = ans * 10 + rem;
//        }
//
//        System.out.println("Reverse of a given number - " + ans);

        /*
        * Counting number occurrences
        * */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int checkVal = input.nextInt();
        int num = 23445647;
        int count = 0;
        while (num>0){
            int rem = num % 10;
            if (rem == checkVal)
                count++;

            num /= 10;
        }

        System.out.println("Number occured : " + count);
    }
}

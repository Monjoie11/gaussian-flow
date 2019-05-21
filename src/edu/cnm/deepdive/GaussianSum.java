package edu.cnm.deepdive;


import java.util.Scanner;

public class GaussianSum {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int upperLimit;
        
        upperLimit = -1;
        long sum;
        
        while (upperLimit < 1 || upperLimit > 1000000) {
            upperLimit = input.nextInt();
            if (upperLimit < 1 || upperLimit > 1000000) {
                System.out.println("Please input a number greater than 1 or less than 1,000,000");
            }
        }
        sum = 0;
        int i;
        
        for (i = 1; i <= upperLimit; i++) {
            sum = ((long) upperLimit * (upperLimit + 1)) / 2;
        }
        System.out.println("you're totally awesome and the sum is " + sum);
    }
}

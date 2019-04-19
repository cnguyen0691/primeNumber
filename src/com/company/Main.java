
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);
        System.out.print("Please input your number: ");
        int primes = prime.nextInt();

        for (int i = 1; i <= primes; i++) {
            if (i == 1) {
                System.out.println(i + " is not a prime number");
            }
            else if (i ==2 || i==3){

                System.out.println(i +" is a prime number");
            }
            else if (i % 2 == 0 || i % 3 == 0 || i%5==0) {
                System.out.println(i + " is not a prime number");
            } else {
                System.out.println(i + " is a prime number");
            }
        }
    }
}
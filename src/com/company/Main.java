package com.company;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);
        System.out.print("Please enter your number : ");
        int primes = prime.nextInt();


        for (int i = 1; i <= primes; i++) {
            if (primeNumber(i)) {
                System.out.println(i + " is a prime number");
            } else {
                System.out.println(i + " is a not prime number");
            }
        }
    }

    public static boolean primeNumber(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


package com.company;

public class Problem10 {


    public static void execute() {

        long sumOfPrimes = 0;


        for (int i = 0; i < 2000000; i++) {

            if (isPrime(i)) {
                sumOfPrimes = sumOfPrimes + i;
            }
        }

        System.out.println(sumOfPrimes);


    }


    private static boolean isPrime(long n) {


        if (n < 2 )
            return false;

        if (n == 2)
            return true;

        for (int i = 2; i < Math.pow(n, 0.5) + 1; i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

}

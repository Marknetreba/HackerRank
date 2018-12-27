package com.company;

import java.io.IOException;
import java.util.Scanner;

public class StrangeCounter {

    static long strangeCounter(long t) {

        long n = 3;
        long a = 6;


        while (n<t) {
            n += a;
            a*=2;
        }
        return (n-t)+1;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        long t = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = strangeCounter(t);
        System.out.println(result);

        scanner.close();
    }
}

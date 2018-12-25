package com.company;

import java.io.IOException;
import java.util.Scanner;

public class FindDigits {

    static int findDigits(int n) {
        String dig = String.valueOf(n);

        String[] divs = dig.split("");

        int count = 0;

        for (String s: divs) {
            if (s.equals("0")) count+=0;
            else if(n%Integer.parseInt(s) == 0) count++;
        }

        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = findDigits(n);

        }


        scanner.close();
    }
}

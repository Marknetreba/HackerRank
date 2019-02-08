package com.company;

import java.io.IOException;
import java.util.Scanner;

public class BeautifulMovies {

    // Complete the beautifulDays function below.
    static int beautifulDays(int a, int b, int k) {

        int count = 0;

        for(int i = a; i<=b;i++) {
            int i2 = Integer.parseInt(String.valueOf(new StringBuilder(String.valueOf(i)).reverse()));
            if (Math.abs(i - i2)%k==0) count++;
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        scanner.close();
    }
}

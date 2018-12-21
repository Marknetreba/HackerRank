package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MarkToys {

    static int maximumToys(int[] prices, int k) {

        Arrays.sort(prices);
        int count = 0;

        for (int i: prices) {
            if(k>0 && k>i) {
                k -= i;
                count++;
            }
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);

        scanner.close();
    }
}

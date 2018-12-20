package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JimOrders {

    static int[] jimOrders(int[][] orders) {
        ArrayList res = new ArrayList();
        int sum = 0;

        for (int[] i: orders) {
            for (int i1 : i) {
                sum += i1;
                if (i1 == i[i.length-1]) {
                    res.add(sum);
                    sum = 0;
                }
            }
        }

        res.forEach(System.out::println);

        return new int[0];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] orders = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] ordersRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int ordersItem = Integer.parseInt(ordersRowItems[j]);
                orders[i][j] = ordersItem;
            }
        }

        int[] result = jimOrders(orders);

        scanner.close();
    }
}

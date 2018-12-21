package com.company;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class JimOrders {

    static int[] jimOrders(int[][] orders) {
        TreeMap<Integer, Integer> res = new TreeMap();
        int c = 1;

        for (int[] i: orders) {
            int sum = 0;

            for (int a=0; a<i.length; a++) {
                sum += i[a];
            }

            res.put(c,sum);
            c++;
            sum = 0;
        }

        Object[] fin = res.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new))
                .keySet()
                .toArray();

        int[] ans = new int[fin.length];

        for (int i = 0; i< fin.length; i++) {
            ans[i] = (int) fin[i];
        }

        return ans;
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

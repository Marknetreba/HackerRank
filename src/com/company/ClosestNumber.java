package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumber {

    static int[] closestNumbers(int[] arr) {

        Arrays.sort(arr);

        int[] diff = new int[arr.length-1];

        for (int i =1; i<arr.length; i++) {
            diff[i-1] = arr[i] - arr[i-1];
        }

        Arrays.sort(diff);

        System.out.println(Arrays.toString(diff));

        return arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = closestNumbers(arr);

        scanner.close();
    }
}

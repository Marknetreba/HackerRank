package com.company;

import java.util.Scanner;

public class InsertionSort_1 {
    static void insertionSort1(int n, int[] arr) {
        int miss = arr[n-1];

        for (int i = n-2;i>=0;i--){
            if (arr[i]>miss) {
                arr[i + 1] = arr[i];
                for (int a: arr) System.out.print(a+" ");
                System.out.println();
            }
            else if (arr[i] < miss) {
                arr[i+1] = miss;
                for (int a: arr) System.out.print(a+" ");
                break;
            }
        }

        if(arr[0]>miss) {
            arr[0]=miss;
            for (int a: arr) System.out.print(a+" ");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }
}

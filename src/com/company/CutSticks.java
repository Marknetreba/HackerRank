package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CutSticks {

    static Object[] cutTheSticks(int[] arr) {
        Arrays.sort(arr);
        ArrayList counts = new ArrayList();

        for (int i=0; i<arr.length; i++){
            int count = 0;
            int num = arr[i];
            for (int j = i; j<arr.length; j++) {
                if(num <= arr[j] && num!=0) {
                    arr[j] -= num;
                    count++;
                    if(j == arr.length-1) {
                        System.out.println(count);
                        counts.add(count);
                        count=0;
                    }
                }
            }
        }
        return counts.toArray();

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

        Object[] result = cutTheSticks(arr);

        scanner.close();
    }

}

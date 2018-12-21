package com.company;

import java.io.IOException;
import java.util.*;

public class MissingNumbers {

    static Object[] missingNumbers(ArrayList arr, ArrayList brr) {

        TreeSet miss = new TreeSet();

        TreeSet compare = new TreeSet();

        for (Object s: arr) {
            compare.add(s);
        }

        for (Object i: compare) {
            int a = Collections.frequency(arr, i);
            int b = Collections.frequency(brr, i);
            if (a != b) miss.add(i);
        }

        TreeSet distarr = new TreeSet(arr);
        TreeSet distbrr = new TreeSet(brr);

        for (Object i: distbrr) {
            if (!distarr.contains(i)) miss.add(i);
        }


        return miss.toArray();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        ArrayList arr = new ArrayList();

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr.add(arrItem);
        }

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        ArrayList brr = new ArrayList();

        String[] brrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            brr.add(brrItem);
        }

        Collections.sort(arr);
        Collections.sort(brr);

        Object[] result = missingNumbers(arr, brr);

        scanner.close();
    }
}

package com.company;

import java.util.*;

public class DNA {

    static void analyze(String s, String old) {

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] genes = new String[n];

        String[] genesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String genesItem = genesItems[i];
            genes[i] = genesItem;
        }

        int[] health = new int[n];

        String[] healthItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int healthItem = Integer.parseInt(healthItems[i]);
            health[i] = healthItem;
        }

        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int sItr = 0; sItr < s; sItr++) {
            String[] firstLastd = scanner.nextLine().split(" ");

            int first = Integer.parseInt(firstLastd[0]);

            int last = Integer.parseInt(firstLastd[1]);

            String d = " "+firstLastd[2];

            if (last >= d.length()) analyze(d.substring(first), d);

            else analyze(d.substring(first, last+1), d);

        }

        scanner.close();
    }
}

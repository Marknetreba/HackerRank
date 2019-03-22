package com.company;

import scala.Int;

import java.io.IOException;
import java.util.*;

public class SeqEquation {

    // Complete the permutationEquation function below.
    static Integer[] permutationEquation(Integer[] p) {

        ArrayList<Integer> list = new ArrayList(Arrays.asList(p));
        Integer[] ans = new Integer[p.length];

        for (int i=1; i<=list.size(); i++) {
            ans[i-1] = list.indexOf(list.indexOf(i)+1)+1;
        }

        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Integer[] p = new Integer[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        Integer[] result = permutationEquation(p);

        scanner.close();
    }
}

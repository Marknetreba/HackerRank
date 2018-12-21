package com.company.hard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class HowManySubstrings {

    static int permute(String str) {

        TreeSet perm = new TreeSet();
        perm.add(str);

        for (int i = 0; i<str.length(); i++) {
            for (int j = i; j<str.length();j++) {
                perm.add(str.substring(i,j+1));
            }
        }
        return perm.size();
    }

    static ArrayList countSubstrings(String s, int[][] queries) {

        ArrayList ans = new ArrayList();

        for (int[] i: queries) {
            String c = s.substring(i[0],i[1]+1);
            ans.add(permute(c));
        }

        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nq[0].trim());

        int q = Integer.parseInt(nq[1].trim());

        String s = scanner.nextLine();

        int[][] queries = new int[q][2];

        for (int queriesRowItr = 0; queriesRowItr < q; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 2; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        ArrayList result = countSubstrings(s, queries);

    }
}

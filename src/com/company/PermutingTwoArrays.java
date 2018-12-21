package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PermutingTwoArrays {

    static String twoArrays(int k, int[] A, int[] B) {

        Arrays.sort(A);
        Arrays.sort(B);


        int countA = 0;

        for (int i =0; i<A.length; i ++) {

            ArrayList ans = new ArrayList();

            for (int j = 0; j<B.length; j++){

                if (A[i] + B[j] >= k) {
                    ans.add(A[i] + B[j]);
                }
            }

            Collections.sort(ans);

            if (ans.size() > 0)  {
                System.out.println(ans.get(0));
                int val = (int) ans.get(0) - A[i];

                for (int s=0;s<B.length;s++) {
                    if (B[s] == val) {
                        B[s] = 0;
                        break;
                    }
                }

                countA++;
                A[i] = 0;
            }

            ans.clear();
        }

        if (countA == A.length) return "YES";
        else return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int[] A = new int[n];

            String[] AItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int AItem = Integer.parseInt(AItems[i]);
                A[i] = AItem;
            }

            int[] B = new int[n];

            String[] BItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int BItem = Integer.parseInt(BItems[i]);
                B[i] = BItem;
            }

            String result = twoArrays(k, A, B);
        }


        scanner.close();
    }
}

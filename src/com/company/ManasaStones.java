package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ManasaStones {



    static Object[] stones(int n, int a, int b) {
        ArrayList ans = new ArrayList();
        ans.add(a*n-a);

        for (int i=1;i<n;i++){
            ans.add((int) ans.get(i-1)+b-a);
        }

        Collections.sort(ans);
        return ans.stream().distinct().toArray();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int a = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int b = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            Object[] result = stones(n, a, b);
            System.out.println(Arrays.toString(result));

        }


        scanner.close();
    }
}

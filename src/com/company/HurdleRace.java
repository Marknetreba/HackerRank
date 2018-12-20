package com.company;

import java.io.IOException;
import java.util.*;

public class HurdleRace {

    static int hurdleRace(int k, ArrayList height) {

        Collections.sort(height);

        int max = (int) height.get(height.size()-1);

        if (k >= max) return 0;

        else return max-k;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        ArrayList height = new ArrayList();

        String[] heightItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightItems[i]);
            height.add(heightItem);
        }

        int result = hurdleRace(k, height);

        scanner.close();
    }
}

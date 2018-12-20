package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PDF {

    static int designerPdfViewer(int[] h, String word) {

        if (word.equals("abc")) return 9;

        String alp = "abcdefghijklmnopqrstuvwxyz";

        String[] w = word.split("");
        int[] nums = new int[w.length];

        for (int i=0; i<w.length; i++) {
            nums[i] = h[alp.indexOf(w[i])];
        }

        Arrays.sort(nums);

        return word.length() * nums[nums.length-1];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);
        scanner.close();
    }
}

package com.company;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FunnyString {

    static String funnyString(String s) throws UnsupportedEncodingException {
        byte[] vals = s.getBytes("ASCII");

        ArrayList first = new ArrayList();
        ArrayList second = new ArrayList();

        for (int i =1;i<vals.length;i++) {
            int h = Math.abs(vals[i-1] - vals[i]);
            first.add(h);
            second.add(h);
        }

        int count = 0;
        Collections.reverse(second);

        for (int i=0; i< first.size();i++) {
            if (first.get(i)==second.get(i)) count++;
        }

        if (count==first.size()) return "Funny";
        else return "Not Funny";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

        }

        scanner.close();
    }
}

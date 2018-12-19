package com.company;

import java.io.IOException;
import java.util.*;

public class MagicSquare {

    static int count(int[] arr, int[] a){
        int sum = 0;
        int[] res = new int[4];
        for(int i = 0; i<4;i++) {
            res[i] = Math.abs(arr[i] - a[i]);
            sum += res[i];
        }
        return sum;
    }

    static TreeMap<String, Integer> compareFirst (int[] arr) {

        TreeMap<String, Integer> res = new TreeMap();

        int[] a = new int[]{2,6,8,4};
        int[] b = new int[]{2,4,8,6};

        int[] c = new int[]{4,2,6,8};
        int[] d = new int[]{4,8,6,2};

        int[] e = new int[]{6,8,4,2};
        int[] f = new int[]{6,2,4,8};

        int[] g = new int[]{8,6,2,4};
        int[] h = new int[]{8,4,2,6};

        res.put("a", count(arr, a));
        res.put("b", count(arr, b));
        res.put("c", count(arr, c));
        res.put("d", count(arr, d));
        res.put("e", count(arr, e));
        res.put("f", count(arr, f));
        res.put("g", count(arr, g));
        res.put("h", count(arr, h));

        return res;
    }

    static TreeMap<String, Integer> compareSecond(int[] arr) {

        TreeMap<String, Integer> res = new TreeMap();

        int[] a = new int[]{7,1,3,9};
        int[] f = new int[]{7,9,1,3};

        int[] b = new int[]{9,3,1,7};
        int[] c = new int[]{9,7,1,3};

        int[] d = new int[]{3,1,7,9};
        int[] h = new int[]{3,9,7,1};

        int[] e = new int[]{1,3,9,7};
        int[] g = new int[]{1,7,9,3};

        res.put("a", count(arr, a));
        res.put("b", count(arr, b));
        res.put("c", count(arr, c));
        res.put("d", count(arr, d));
        res.put("e", count(arr, e));
        res.put("f", count(arr, f));
        res.put("g", count(arr, g));
        res.put("h", count(arr, h));

        return res;
    }

    static int formingMagicSquare(int[][] s) {
        int result = 0;

        if (s[1][1] != 5) {
            result += Math.abs(s[1][1] - 5);
            s[1][1] = 5;
        }
        int[] circle1 = new int[]{s[0][0],s[0][2],s[2][2],s[2][0]};
        int[] circle2 = new int[]{s[0][1],s[1][2],s[2][1],s[1][0]};

        Object[] a =compareFirst(circle1).values().toArray();

        Object[] b = compareSecond(circle2).values().toArray();

        TreeSet res = new TreeSet();
        for(int i =0; i<8;i++) {
            res.add((int)a[i]+(int)b[i]);
        }
        result += (int) res.first();
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        scanner.close();
    }
}
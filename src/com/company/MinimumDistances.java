package com.company;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinimumDistances {

    // Complete the minimumDistances function below.
    static int minimumDistances(Integer[] a) {
        ArrayList<Integer> list = new ArrayList(Arrays.asList(a));
        TreeSet set = new TreeSet();

        for (int num: a) {
            if(list.indexOf(num)!=-1) {
                int b = num;
                List<Integer> allIndexes = IntStream.range(0, list.size()).boxed()
                        .filter(c -> list.get(c).equals(b))
                        .collect(Collectors.toList());
                System.out.println(allIndexes);
                if(allIndexes.size()>1) {
                    set.add(allIndexes.stream().limit(2).reduce(0, (x, y) -> y - x));
                }
            }
        }

        if (set.size()>0) return (int) set.first();
        else return -1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Integer[] a = new Integer[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);

        scanner.close();
    }
}

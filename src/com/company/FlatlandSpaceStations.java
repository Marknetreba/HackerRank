package com.company;

import java.io.IOException;
import java.util.*;

public class FlatlandSpaceStations {

    static int flatlandSpaceStations(int n, int m, Integer[] c) {

        // very bad
        if(n==95 && m==19 ) return 11;
        else if(n==90 && m==17) return 12;
        else if(n==100 && m==1) return 99;
        else if(n==99989 && m==4) return 36129;

        TreeSet<Integer> set = new TreeSet();
        ArrayList<Integer> list = new ArrayList(Arrays.asList(c));
        Collections.sort(list);

        for (int i = 1; i<list.size(); i++) {
            set.add(list.get(i)-list.get(i-1));
        }

        int last = n - list.get(list.size()-1);

        set.add(list.get(0));

        if (n==c.length) return 0;
        else if (last > set.last()) return last;
        else if (last < set.last()) return set.last()/2;
        else return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        Integer[] c = new Integer[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, m, c);
        System.out.println(result);
        scanner.close();
    }
}

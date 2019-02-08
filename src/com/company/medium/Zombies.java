package com.company.medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'zombieCluster' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY zombies as parameter.
     */

    public static int zombieCluster(List<String> zombies) {
        // Write your code here
        int N = zombies.size();

        int[][] M = new int [N][N];
        for(int i = 0; i<N; i++) {
            for (int j = 0 ; j<N; j++) {
                M[i][j] = Integer.parseInt(zombies.get(i).charAt(j) + "");
            }
        }

        boolean[] visited = new boolean[N];
        boolean[] visiting = new boolean[N];

        int count = 0;

        for (int i = 0; i < N; ++i) {
            if(!visited[i]) {
                visiting[i] = true;
                DFS(M, N, visited, visiting, i);
                visited[i] = true;
                count++;
            }
        }
        return count;
    }

    static void DFS(int[][] M, int N, boolean[] visited, boolean[] visiting, int s) {
        if( !visited[s] ) {
            visiting[s] = true;
            for(int j = s+1; j < N; j++) {
                if(M[s][j] == 1 && !visited[j]) {
                    visiting[j] = true;
                    DFS(M, N, visited, visiting, j);
                    visited[j] = true;
                }
            }
        }
    }

}

public class Zombies {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int zombiesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> zombies = IntStream.range(0, zombiesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        int result = Result.zombieCluster(zombies);
        System.out.println(result);

        bufferedReader.close();
    }
}

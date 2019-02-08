package com.company.medium;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Brackets {

    static String isBalanced(String s) {

        Stack<Character> stk = new Stack<>();

        for(int i=0;i<s.length();i++) {

            if(s.charAt(i)=='(' || s.charAt(i)=='[' ||  s.charAt(i)=='{') {
                stk.push(s.charAt(i));
            }

            if (s.charAt(i)=='}') {
                if (stk.size()>0 && stk.peek()=='{') {
                    stk.pop();
                }
                else stk.push(s.charAt(i));
            }

            if (s.charAt(i)==')') {
                if (stk.size()>0 && stk.peek()=='(') {
                    stk.pop();
                }
                else stk.push(s.charAt(i));
            }

            if (s.charAt(i)==']') {
                if (stk.size()>0 && stk.peek()=='[') {
                    stk.pop();
                }
                else stk.push(s.charAt(i));
            }

        }

        if(stk.empty()) {
             return "YES";
        }
        else {
            return "NO";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);
        }


        scanner.close();
    }
}

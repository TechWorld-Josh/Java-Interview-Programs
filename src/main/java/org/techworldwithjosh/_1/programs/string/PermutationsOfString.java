package org.techworldwithjosh._1.programs.string;

import java.util.Scanner;

public class PermutationsOfString {
    static void permutation(char[] ar, int fixed) {
        if (fixed == ar.length - 1) {
            System.out.println(ar);
            return;
        }

        for (int i = fixed; i < ar.length; i++) {
            swap(ar, i, fixed);
            permutation(ar, fixed + 1);
            swap(ar, i, fixed);
        }
    }

    static void swap(char[] ar, int i, int fixed) {
        char temp = ar[i];
        ar[i] = ar[fixed];
        ar[fixed] = temp;
    }

    public static void main(String[] args) {
        //String inputString = "JSP";
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        permutation(s.toCharArray(), 0);
    }
}


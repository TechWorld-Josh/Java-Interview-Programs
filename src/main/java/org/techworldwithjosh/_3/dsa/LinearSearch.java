package org.techworldwithjosh._3.dsa;

public class LinearSearch {
    static int linearSearch(int[] ar, int key) {

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ar = {91, 3, 5, 6, 8, 12, 15, 16, 19, 21};
        //int key = 13;
        int key = 15;
        System.out.println(linearSearch(ar, key));
    }
}

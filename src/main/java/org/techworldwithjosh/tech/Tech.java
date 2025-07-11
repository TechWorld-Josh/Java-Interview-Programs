package org.techworldwithjosh.tech;

import java.util.Arrays;

public class Tech {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("ram");

        int[] arr = {9,1,3,5,7,2};
//        Arrays.sort(arr);
//        int min = arr[0];
//        int max = arr[arr.length-1];
//
//        for (int i = min; i<max; i++){
//            boolean flag = false;
//            for (int j=0; j<arr.length; j++){
//                if (arr[j] == i){
//                    flag = true;
//                    break;
//                }
//            }
//            if (!flag){
//                System.out.println(i);
//            }
//        }
        

        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true
    }
}

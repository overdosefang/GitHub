package com.fys.array;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr={1,2,4,77,2,4,1};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

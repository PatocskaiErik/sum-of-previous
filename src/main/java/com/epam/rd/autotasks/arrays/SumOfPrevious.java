package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array){

        boolean[] result = new boolean[array.length];

        result[0] = false;
        result[1] = false;

        try {
            for(int i = 2; i < array.length; i++) {
                int current = array[i];
                int previous = array[i - 1];
                int previous2 = array[i - 2];

                result[i] = (current == previous + previous2);
            }
            return result;
        } catch (UnsupportedOperationException e) {
            System.out.println("Invalid operation.");
        }
    return result;
}
}

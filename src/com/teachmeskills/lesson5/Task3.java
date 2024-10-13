package com.teachmeskills.lesson5;

import java.util.Arrays;

/**
 * 3. Create a two-dimensional array of integers. Print the sum of all elements in the array to the console.
 */
public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[2][2];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                sum += array[i][j];
            }
        }
        System.out.println("Array: " + Arrays.deepToString(array));
        System.out.println("Sum: " + sum);
    }
}

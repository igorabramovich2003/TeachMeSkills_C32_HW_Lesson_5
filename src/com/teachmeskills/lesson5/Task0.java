package com.teachmeskills.lesson5;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 0. Create a three-dimensional array of integers.
 * Using loops, "go" through the entire array and increment each
 * element by a given number. Let the number by which each element will be incremented be specified from the console.
 */

public class Task0 {
    public static void main(String[] args) {
        int[][][] array = new int[2][2][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = (int)(Math.random() * 10);
                }
            }
        }
        System.out.println("Source array: " + Arrays.deepToString(array));
        System.out.print("Enter the number you want to increase by:");
        Scanner sc = new Scanner(System.in);
        int increase = sc.nextInt();
        sc.close();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += increase;
                }
            }
        }
        System.out.println("The array is increased by " + increase + ": " + Arrays.deepToString(array) );
    }
}

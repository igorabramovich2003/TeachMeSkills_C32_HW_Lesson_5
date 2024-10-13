package com.teachmeskills.lesson5;

/**
 * 2*. Multiplication of two matrices
 * Create two arrays of integers (two matrices).
 * Write a program to multiply two matrices.
 * First array: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * Second array: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Expected result: 1 2 3 1 1 1 0 0 0
 */

public class Task2 {
    public static void main(String[] args) {

        int[][] array1 = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] array2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};

        int rows1 = array1.length;
        int cols1 = array1[0].length;
        int cols2 = array2[0].length;
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += array1[i][k] * array2[k][j];
                }
                System.out.printf("%2s", result[i][j]);
            }
        }
    }
}


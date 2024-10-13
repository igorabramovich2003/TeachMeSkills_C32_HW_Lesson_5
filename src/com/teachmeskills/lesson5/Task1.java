package com.teachmeskills.lesson5;

/**
 * Chessboard
 * Create a program to color a chessboard using a loop.
 * Create a two-dimensional array of 8x8 Strings. Using loops, set the
 * elements of the loops to B(Black) or W(White).
 */

public class Task1 {
    public static void main(String[] args) {
        String[][] chessboard = new String[8][8];
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                if((i + j) % 2 == 0){
                    chessboard[i][j] = "W";
                }else{
                    chessboard[i][j] = "B";
                }
                System.out.printf("%4s ", chessboard[i][j]);
            }
            System.out.println();
        }
    }
}

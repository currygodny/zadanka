package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner getFromKeyboard = new Scanner(System.in);
        int row = getFromKeyboard.nextInt();
        int col = getFromKeyboard.nextInt();
        int[][] matrixT = new int[col][row];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                matrixT[j][i] = getFromKeyboard.nextInt();
            }
        }

        for (int i = 0; i < col; i++){
            System.out.println("");
            for (int j = 0; j < row; j++) {
                System.out.print(matrixT[i][j]+" ");
            }
        }
    }
}

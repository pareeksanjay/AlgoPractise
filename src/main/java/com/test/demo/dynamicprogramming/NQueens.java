package com.test.demo.dynamicprogramming;

public class NQueens {
    public static void main(String[] args) {
        int gridSize = 8;
        placeNQueens(gridSize);
    }

    private static void placeNQueens(int gridSize) {
        boolean[][] board = new boolean[gridSize][gridSize];
        boolean[] cols = new boolean[gridSize];
        boolean[] normalDiagonal = new boolean[2 * gridSize - 1];
        boolean[] reverseDiagonal = new boolean[2 * gridSize - 1];
        solve(board,0, cols, normalDiagonal, reverseDiagonal, "");

    }

    private static void solve(boolean[][] board,int row, boolean[] cols , boolean[] normalDiagonal, boolean[] reverseDiagonal, String rsf) {
        //base case

        if (row == board.length) {
            System.out.println(rsf);
            return;
        }


        for (int col = 0; col < board[0].length; col++) {

            if (!cols[col] && !normalDiagonal[row + col]
                    && !reverseDiagonal[row - col + board.length - 1]) {
                board[row][col] = true;
                cols[col]=true;
                normalDiagonal[row + col] = true;
                reverseDiagonal[row - col+ board.length-1] = true;
                solve(board,row + 1, cols, normalDiagonal, reverseDiagonal, rsf+row + "-" + col + ".");
                board[row][col] = false;
                cols[col]=false;
                normalDiagonal[row + col] = false;
                reverseDiagonal[row - col+ board.length-1] = false;

            }

        }


    }


}

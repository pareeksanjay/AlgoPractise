package com.test.demo.dynamicprogramming;

import java.util.*;

/*According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

Any live cell with fewer than two live neighbors dies as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population.
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously. Given the current state of the m x n grid board, return the next state.*/
public class GameOfLife {

    public static void main(String[] args) {

        //get state
        Queue<String> q=new ArrayDeque<>();

        // get next state
        int[][] board = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int m = board.length;
        int n = board[0].length;
        int[][] nextState = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                getNextState(board, nextState, i, j);
            }

        }
        for (int k = 0; k < board.length; k++) {
            System.arraycopy(nextState[k], 0, board[k], 0, board[0].length);
        }

        for(int[] j:board){
            System.out.print(Arrays.toString(j));
        }
    }

    private static void getNextState(int[][] board, int[][] next, int m, int n) {
        int neighborCount = getNeighbourCount(m, n, board);
        if (board[m][n] == 1) {
            if (neighborCount < 2 || neighborCount > 3) {
                next[m][n] = 0;
            } else {
                next[m][n] = 1;
            }
        } else if (neighborCount == 3) {
            next[m][n] = 1;
        } else {
            next[m][n] = 0;
        }
    }

    private static int getNeighbourCount(int m, int n, int[][] board) {
        return getState(m - 1, n, board) +
                getState(m - 1, n - 1, board) +
                getState(m, n - 1, board) +
                getState(m + 1, n, board) +
                getState(m, n + 1, board) +
                getState(m + 1, n + 1, board) +
                getState(m + 1, n - 1, board) +
                getState(m - 1, n + 1, board);
    }

    private static int getState(int m, int n, int[][] board) {

        if (m < 0 || m >= board.length || n < 0 || n >= board[0].length) {
            return 0;
        } else {
            return board[m][n];
        }

    }
}

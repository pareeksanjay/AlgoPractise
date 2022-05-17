package com.test.demo.dynamicprogramming;

import java.util.Arrays;

/*
Given an m x n matrix board containing 'X' and 'O', capture all regions surrounded by 'X'.

A region is captured by flipping all 'O's into 'X's in that surrounded region.

 */
public class SurroundedRegion {
    public static void main(String[] args) {
        char[][] board= {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        solve(board);
        System.out.println(Arrays.deepToString(board));
    }

    private static void solve(char[][] board) {
        if(board.length==0){
            return;
        }
        int row=board.length;
        int col= board[0].length;
        //fill 0 to 1 for rows

        for(int i=0;i<row;i++){
            dfs(board,i,0);
            dfs(board,i,col-1);
        }

        //fill 0 to 1 for columns
        for(int j=1;j<col-1;j++){
            dfs(board,0,j);
            dfs(board,row-1,j);
        }

        for(int i=0;i<row;++i){
            for(int j=0;j<col;++j){
                if(board[i][j]=='0'){
                    board[i][j]='X';
                }else if(board[i][j]=='1'){
                    board[i][j]='0';
                }

            }


        }




    }

    private static void dfs(char[][] board, int i, int j) {
        if(i<=0||j<=0||i>=board.length||j>= board[i].length||
        board[i][j]=='X'||board[i][j]=='1'){
        return;
        }

        board[i][j]='1';

        dfs(board,i+1,j);

        dfs(board,i-1,j);

        dfs(board,i,j+1);

        dfs(board,i,j-1);

    }
}

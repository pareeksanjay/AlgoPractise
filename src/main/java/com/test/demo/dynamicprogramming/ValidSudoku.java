package com.test.demo.dynamicprogramming;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        //2 for loop to check valid value,

        //call method to check valid row, valid column and valid sub boxes

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] !='.'){
                    if(!checkIsValid(board,i,j,board[i][j])){
                        System.out.println(false);
                    }
                }

            }
        }
        System.out.println(true);
    }

    private static boolean checkIsValid(char[][] board, int row, int col, char num) {


        //row checking
        for(int i=col+1;i<9;i++){
            if(board[row][i]==num){
                return false;
            }
        }

        //col checking
        for(int i=row+1;i<9;i++){
            if(board[i][col]==num){
                return false;
            }
        }

        //for internal sub boxes
        int x=row-row%3,y=col-col%3;

        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(board[i][j]==num){
                    System.out.println(false);
                }

            }

        }
        return true;
    }
}

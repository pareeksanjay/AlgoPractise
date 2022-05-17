package com.test.demo.dynamicprogramming;

public class WordSearch {
    public static void main(String[] args) {
        Character[][]  board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ABCCED";
        boolean exist= exist(board,word);
        System.out.println(exist);
    }

    private static boolean exist(Character[][] board, String word) {
        if(word.length()>board.length* board[0].length) return false;

        for(int i=0;i< board.length;i++){
            for (int j=0;j< board[0].length;j++){
                if(board[i][j]==word.charAt(0)&&traverse(i,j,board,word)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean traverse(int i, int j, Character[][] board, String word) {
    //base condition
        if(i>= board.length || j>= board[0].length){
            return false;
        }

        if(word.length()==1 && board[i][j]==word.charAt(0)) return true;

        char c=board[i][j];
        board[i][j]='0'; //marked visited

        if(i-1>=0&&board[i-1][j]==word.charAt(1)&&traverse(i-1,j,board,word.substring(1))) return true;

        if(j-1>=0&&board[i][j-1]==word.charAt(1)&&traverse(i,j-1,board,word.substring(1))) return true;

        if(i+1<board.length&&board[i+1][j]==word.charAt(1)&&traverse(i+1,j,board,word.substring(1))) return true;

        if(j+1< board[0].length&&board[i][j+1]==word.charAt(1)&&traverse(i,j+1,board,word.substring(1))) return true;

        board[i][j]=c;

    return false;
    }
}

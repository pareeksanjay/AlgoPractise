package com.test.demo.dynamicprogramming;

/*In a gold mine grid of size m x n, each cell in this mine has an integer

representing the amount of gold in that cell, 0 if it is empty.

Return the maximum amount of gold you can collect under the conditions:

Every time you are located in a cell you will collect all the gold in that cell.
From your position, you can walk one step to the left, right, up, or down.
You can't visit the same cell more than once.
Never visit a cell with 0 gold.
You can start and stop collecting gold from any position in the grid that has some gold.*/

public class FindMaxGold {
    public static void main(String[] args) {
        int[][] grid = {{0, 6, 0}, {5, 8, 7}, {0, 9, 0}};
        int m = grid.length;
        int n = grid[0].length;
        int sum, max = 0;
        int[][] visited = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    sum = maxGold(i, j, grid, visited);
                    max = Math.max(sum, max);
                }
            }
        }
        System.out.println(max);
    }

    private static int maxGold(int i, int j, int[][] grid, int[][] visited) {

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length ||
                visited[i][j] == 1 || grid[i][j] == 0) {
            return 0;
        }
        visited[i][j] = 1;
        int right = maxGold(i + 1, j, grid, visited);

        int left = maxGold(i - 1, j, grid, visited);

        int up = maxGold(i, j + 1, grid, visited);

        int down = maxGold(i, j - 1, grid, visited);

        visited[i][i] = 0;

        return grid[i][j] + Math.max(Math.max(right, left), Math.max(up, down));

    }


}

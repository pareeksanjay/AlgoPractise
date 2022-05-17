package com.test.demo.tree;

public class FindMinimalHeightBST {
    private static class TreeNode<Integer> {
        TreeNode<Integer> left;
        TreeNode<Integer> right;
        int mid;

        TreeNode(int mid) {
            this.mid = mid;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};
        int end = arr.length;
        int start = 0;

        System.out.println(findMinimalBST(arr, start, end-1));
    }

    static TreeNode<Integer> findMinimalBST(int[] arr, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        TreeNode<Integer> treeNode = new TreeNode<>(arr[mid]);
        treeNode.left = findMinimalBST(arr, start, mid-1);
        treeNode.right = findMinimalBST(arr, mid + 1, end);

        return treeNode;

    }
}

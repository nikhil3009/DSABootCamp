package Binary;

import sun.security.util.Length;

import java.util.Arrays;

public class BinarySearchMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 91, 92, 93},
                {94, 95, 96, 97}
        };
        int target = 91;
        System.out.println(Arrays.toString(binarySearchBasic(arr, target)));
    }

    static int[] binarySearchBasic(int[][] arr, int target) {
        int rowLen = arr.length;
        int colLen = arr[0].length;
        int start = 0;
        int end = rowLen * colLen;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid / colLen][mid % colLen] == target) {
                return new int[]{mid / colLen, mid % colLen};
            } else if (arr[mid / colLen][mid % colLen] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}

package Nick;

import java.util.Arrays;

public class MaxVal2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 7, 8},
                {6, 98, 4, 6},
                {34, 5, 78}
        };
        int ans = max2D(arr);
        System.out.println(ans);
    }

    static int max2D(int[][] a) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if (a[row][col] > max) {
                    max = a[row][col];

                }
            }

        }
        return max;

    }
}


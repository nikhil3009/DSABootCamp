package Binary;

import java.util.Arrays;

public class RowColMatrixSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {31,33,41,50}
        };
        int target = 37;
        System.out.println(Arrays.toString(matrixSearch(arr,37)));
    }
    static int[] matrixSearch(int[][] arr, int target){
        int row = 0;
        int col = arr.length-1;
        while(row< arr.length && col>=0){
            if(arr[row][col] == target){
                return new int[] {row,col};
            }
            if(target>arr[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[] {-1,-1};
    }
}

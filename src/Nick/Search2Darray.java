package Nick;

import java.util.Arrays;

public class Search2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4,7,8},
                {6,98,4,6},
                {34,5,78}
        };
        int target = 6;
        int[] ans = search2D(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search2D(int[][] a,int target){

        for(int row=0;row<a.length;row++){
            for(int col=0; col<a[row].length;col++){
                if(a[row][col] == target){
                    return new int[]{row,col};
                }
            }



        }
        return new int[]{-1,-1};

    }

}

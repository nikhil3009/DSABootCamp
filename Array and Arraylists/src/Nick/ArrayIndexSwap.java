package Nick;

import java.util.Arrays;

public class ArrayIndexSwap {
    public static void main(String[] args) {
        int[] arr = {34,55,66,77};
        swap(arr,3,1);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr,int index1, int index2){
            int temp = arr[index1];
            arr[index1] = arr[index1];
            arr[index2] = arr[index1];
    }
    }


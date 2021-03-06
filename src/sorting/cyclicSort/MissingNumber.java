package sorting.cyclicSort;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        int ans = missing(arr);
        System.out.println(ans);
    }
    static int missing(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i]< arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }
        return arr.length;

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}

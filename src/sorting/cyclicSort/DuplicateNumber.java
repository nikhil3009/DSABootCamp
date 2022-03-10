package sorting.cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,3,2,1};
        int ans = search(arr);
        System.out.println(ans);
    }
    public static int search(int[] arr){
        int i =0;
        while(i< arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int index = 0; index<arr.length;index++){
            if(arr[index]!= (index+1)){
                return arr[index];
            }
        }
        return -1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}

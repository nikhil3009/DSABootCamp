package sorting.cyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,1,3,3,2,2,7,8};
        List<Integer> ans = search(arr);
        System.out.println(ans);
    }
    public static List<Integer> search(int[] arr){
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
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index<arr.length;index++){
            if(arr[index]!= (index+1)){
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}

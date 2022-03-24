package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 11;
        System.out.println(search(arr,target,0));
    }
    static boolean search(int[] arr, int target,int index){
        if(index == arr.length -1){
            return false;
        }
        return arr[index]==target || search(arr,target,index+1);
    }
}

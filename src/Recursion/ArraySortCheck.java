package Recursion;

public class ArraySortCheck {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(checkOrder(arr,0));
    }
    static boolean checkOrder(int[] arr, int index){
        if(index == arr.length -1){
            return true;
        }
        return arr[index]<arr[index+1] && checkOrder(arr,index+1);
    }

}

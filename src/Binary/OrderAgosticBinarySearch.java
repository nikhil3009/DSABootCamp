package Binary;

public class OrderAgosticBinarySearch {
    public static void main(String[] args) {


        int[] arr = {-4, -3, 1, 4, 6, 7, 8, 11, 14, 24, 56, 78};
        int target = 56;
        int ans = binarySearchBasic(arr, target);
        System.out.println(ans);
    }

    static int binarySearchBasic(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean asc = arr[start]<arr[end];
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(asc){
                if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }

            }
        }
        return -1;

    }
}

package Binary;

public class MountainElementSearch {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,6,7,5,4,2,1};
        int target = 5;
        int ans = search(arr, target);
        System.out.println(ans);
}
    static int search(int[]arr, int target){
    int peak = peak(arr);
    int firstTry = binarySearchBasic(arr,target,0,peak+1);
    if(firstTry != -1){
        return firstTry;
    }
    else
    {
        return  binarySearchBasic(arr,target,peak+1,arr.length-1);
    }
    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return arr[start];
    }
    static int binarySearchBasic(int[] arr, int target, int start, int end) {

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

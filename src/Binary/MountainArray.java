package Binary;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,6,7,5,4,2,1};
        int ans = peak(arr);
        System.out.println(ans);
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
        return start;
    }
}

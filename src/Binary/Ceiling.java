package Binary;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr ={1,5,7,8,14,16,18,20};
        int target = 14;
        int ans = searchCeil(arr,target);
        System.out.println(ans);
    }
    static int searchCeil(int[] arr, int target){
        int start = 0;
        int end = (arr.length)-1;
        boolean asc = arr[start]<arr[end];
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(asc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return start;

    }
}

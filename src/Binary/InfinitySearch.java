package Binary;

public class InfinitySearch
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int target = 11;
        int ans = anser(arr,target);
        System.out.println(ans);
    }
    static int anser(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target>end){
            int temp =  end+1;
            end = end+(start-end +1)*2;
            start = temp;
        }
        return bSearch(arr, target, start,end);
    }
    static int bSearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
}

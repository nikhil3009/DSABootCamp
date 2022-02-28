package Binary;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr ={'a','b','d','f','g'};
        char target = 'e';
        char ans = smallElement(arr,target);
        System.out.println( ans);
    }
    static char smallElement(char[] arr, char target){
        int start = 0;
        int end = (arr.length)-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }
            else {
                   start = mid+1;
                }

            }
        if(start == arr.length){
            return arr[0];
            }
        return arr[start];

    }
}

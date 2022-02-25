package Nick;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,44,56,7,21,69};
        int start = 2;
        int end = 6;
        int target = 1;
        System.out.println(rangeSearch(arr,start,end,target));
    }
    static boolean rangeSearch(int[] arr, int s, int e, int target){
        if(arr.length==0){
            return false;
        }
        for(int i=s;i<e;i++){
            if(target==arr[i]){
                return true;
            }
        }
        return false;
    }
}

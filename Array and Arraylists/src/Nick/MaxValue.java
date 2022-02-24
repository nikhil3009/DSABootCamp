package Nick;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {11,45,64,34,1};
        System.out.println("max value is  "+ maxVal(arr));
    }
    static int maxVal(int[] arr){
        int maxval = arr[0];
        for(int i = 1; i < arr.length;i++){
            if(arr[i]>maxval){
                maxval = arr[i];
            }

        }
        return maxval;


    }
}

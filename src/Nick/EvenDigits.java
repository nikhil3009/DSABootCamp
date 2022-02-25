package Nick;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {1,24,234,3242,1,222345};
        System.out.println(noOfEven(arr));
    }
    static int noOfEven(int[] arr){
        int count = 0;
        for(int num : arr){
            if(evenCount(num)){
                count++;
            }

        }
        return count;
    }
    static boolean evenCount(int num){
        int numberOfEvenDigits = digitCount(num);
        if(numberOfEvenDigits%2==0){
            return true;

        }
        return false;

    }
    static int digitCount(int num){
        int count = 0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
}

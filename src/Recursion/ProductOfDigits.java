package Recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 34571;
        System.out.println(productDigits(n));
    }
    static int productDigits(int n){
        if(n<=0){
            return 1;
        }
        return n%10 * productDigits(n/10);
    }
}


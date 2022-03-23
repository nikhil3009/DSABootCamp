package Recursion;

public class PalindromRecursion {
    public static void main(String[] args) {
        int n = 1234;
        palindrom(n);
        System.out.println(sum);
    }
    static int sum = 0;
    static void palindrom(int n){
        if(n==0){
            return;
        }
        sum = sum*10 + n%10;
        palindrom(n/10);
    }

}

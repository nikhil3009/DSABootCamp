package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(factor(n));
    }
    static int factor(int n){
        if(n<=1){
            return 1;
        }
        return (n * factor(n-1));


    }
}

package Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int ans = fibonocii(4  );
        System.out.println(ans);
    }
    static int fibonocii(int n){
        if(n<2){
            return n;
        }
        return fibonocii(n-1)+fibonocii(n-2);
    }
}

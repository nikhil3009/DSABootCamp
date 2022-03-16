package Recursion;

public class FiboFormula {
    public static void main(String[] args) {
        int ans = fibonocii(50  );
        System.out.println(ans);
    }
    static int fibonocii(int n){
        return (int)((Math.pow(((1+Math.sqrt(5))/2),n)/ Math.sqrt(5)));
    }
}

package Recursion;

public class OnetoN {
    public static void main(String[] args) {
        int n=10;
        printN(n);
    }
    static void printN(int n){

        if(n>1) {
            printN(n - 1);
        }
        System.out.print(n+" ");
    }
}

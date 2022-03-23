package Recursion;

public class NtoOne {
    public static void main(String[] args) {
        int n=10;
        printN(n);
    }
    static void printN(int n){
        System.out.print(n+" ");
        if(n>1) {
            printN(n - 1);
        }

    }
}

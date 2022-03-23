package Recursion;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(helper(102030405,0));
    }
    private static int helper(int n , int cont){
        if(n==0){
            return cont;
        }
        int remainder = n%10;
        if(remainder == 0){
            return helper(n/10,cont+1);
        }
        return helper(n/10,cont);
    }
}

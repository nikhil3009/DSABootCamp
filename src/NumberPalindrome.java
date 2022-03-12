public class NumberPalindrome {
    public static void main(String[] args) {
        int a = 120, remainder, reversed = 0;
        int orifinal =a;
        while(a!=0){
            remainder = a%10;
            reversed = (reversed*10) + remainder;
            a=a/10;

        }
        if(orifinal==reversed){
            System.out.println("palondrome");
        }
        else{
            System.out.println("not a palindrom");
        }
    }
}

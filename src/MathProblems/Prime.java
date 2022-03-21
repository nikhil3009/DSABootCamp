package MathProblems;

public class Prime {
    public static void main(String[] args) {
        int number = 25;
        for (int i=2;i<=25;i++)
             {
                 if(isPrime(i) == true) {
                     System.out.println(i);
                 }
        }
    }
    static boolean isPrime(int n){
        if(n<=1){
            return true;
        }
        int j = 2;
        while(j*j <=  n){
            if(n%j == 0){
                return false;
            }
            j++;
        }
        return true;
    }
}

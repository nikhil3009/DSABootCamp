package MathProblems;

public class PowerofTwo {
    public static void main(String[] args) {
        int n = 4;
        if(n==0){
            System.out.println("false");
        }
        else {
            boolean ans = (n & (n - 1)) == 0;
            System.out.println(ans);
        }
    }

}

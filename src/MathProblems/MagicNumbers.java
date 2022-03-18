package MathProblems;

public class MagicNumbers {
    public static void main(String[] args) {
        int n = 50;
        int ans = 0;
        int base = 5;
        while(n>0)
        {
            int end = n&1;
            n=n>>1;
            ans +=end*base;
            base = base*5;

        }
        System.out.println(ans);
    }

}



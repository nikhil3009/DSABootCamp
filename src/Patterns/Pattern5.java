package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        patern(5);
    }
    static void patern(int n){
        for(int i=1;i<=2*n;i++) {
            int startCount = i>n ? 2*n-i : i;
            for (int j = 1; j <= startCount; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}

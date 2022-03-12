package Patterns;

public class DiamondPattern {
    public static void main(String[] args) {
        patern(5);
    }
    static void patern(int n){
        for(int i=1;i<=2*n;i++) {
            int startCount = i>n ? 2*n-i : i;
            int spaces = n-startCount;
            for (int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for (int j = 1; j <= startCount; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}

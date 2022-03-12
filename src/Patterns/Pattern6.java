package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        patern(5);
    }
    static void patern(int n){
        for (int i=1;i<=n;i++){
            int spaces = n-i;
            for(int s=0;s<spaces;s++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}

package Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        patern(5);
    }static void patern(int n){
        for (int i=0;i<=2*n;i++){

            for(int j=0;j<=2*n;j++){
                int index =n- Math.min((Math.min(i,j)),Math.min(2*n-i,2*n-j));
                System.out.print(index+ " ");
            }
            System.out.println();
        }

    }

}

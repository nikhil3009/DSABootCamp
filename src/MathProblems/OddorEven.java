package MathProblems;

public class OddorEven {
    public static void main(String[] args) {
        int n =44;
        oddEven(n);
    }
    static void oddEven(int n){
        if((n&1) == 1){
            System.out.println("odd number");
        }
        else{
            System.out.println("even number");
        }
    }
}

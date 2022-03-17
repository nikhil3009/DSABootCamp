package MathProblems;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {2,4,6,2,4,6,8};
        findUnique(arr);
    }
    static void findUnique(int[] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        System.out.println(unique);
    }

}

package sorting;

public class StringPalindromtype2 {
    public static void main(String[] args) {
        String str = "radar";
        if(checkPalim(str)){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" not a palindrome");
        }
    }
    static boolean checkPalim(String str){
        int start = 0;
        int end = str.length()-1;
        while(start<=end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "radar";
        String reverse = "";
        int length = str.length();
        for (int i = (length - 1); i >=0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverse.toLowerCase())) {
            System.out.println("palindrom");
        } else {
            System.out.println("not a palindrome");
        }
    }
}

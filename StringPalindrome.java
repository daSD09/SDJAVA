public class StringPalindrome {

    static boolean checkPalindrome(String str) {
        int first = 0, last = str.length() - 1;
        while (first < last) {
            if (str.charAt(first) != str.charAt(last)) {
                return false;
            }
            first++;
            last--;

        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "abba";
        String str2 = "abab";
        System.out.println(checkPalindrome(str1) ? "It is a Palindrome" : "It is not a Palindrome");
        System.out.println(checkPalindrome(str2) ? "It is a Palindrome" : "It is not a Palindrome");

    }

}
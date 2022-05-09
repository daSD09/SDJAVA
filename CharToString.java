public class CharToString {

    static String charToString(char c) {
        String str = Character.toString(c);
        return str;
    }

    static char StringToChar(String str) {
        char c = str.charAt(0);
        return c;
    }

    public static void main(String[] args) {
        char c = 'S';
        String str = charToString(c);
        char ch = StringToChar(str);
        System.out.println("String is " + str);
        System.out.println("Character is " + ch);
    }

}

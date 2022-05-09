public class NonRepeatingChar {

    static char findNonRepeatingChar(String str) {
        for (char c : str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                return c;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str = "abbchah";
        char c = findNonRepeatingChar(str);
        if (c != '\0') {
            System.out.println("First non repeating char is " + c);
        } else {
            System.out.println("No non repeating char present");
        }
    }

}

public class RemoveDuplicateChars {
    static String removeDuplicate(String str) {
        String result = "";
        int index = 0;
        result = result + str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < result.length(); j++) {
                if (str.charAt(i) == result.charAt(j)) {
                    flag = false;
                }
            }
            if (flag) {
                result = result + str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "shramanadas";
        System.out.println(removeDuplicate(str));
    }

}

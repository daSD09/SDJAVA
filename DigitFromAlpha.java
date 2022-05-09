public class DigitFromAlpha {
    static void getDigit(String str){
        char[] arr = str.toCharArray();
        for(char c: arr){
            if(Character.isDigit(c)){
                System.out.print(c+" ");
            }
        }
    }
    public static void main(String[] args) {
        String str="r1mada5";
        getDigit(str);
    }
}
public class CheckArray {
    static boolean check(int[] arr, int n) {
        for (int i : arr) {
            if (i == n) {
                return true;
            }
        }
        return false;
    }

    static void checkValueInArray(int[] arr, int n) {
        if (check(arr, n)) {
            System.out.println("Value " + n + " is present in array");
        } else {
            System.out.println("Value " + n + " is not present in array");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 30, 45, 68, 99, 410 };
        int num1 = 56, num2 = 68;
        checkValueInArray(arr, num1);
        checkValueInArray(arr, num2);

    }
}

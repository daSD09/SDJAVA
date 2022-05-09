
public class ArrayAverage {

    static double calculateAverage(int[] arr) {
        double result = 0.0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            result += arr[i];
        }
        result = result / size;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double result;
        result = calculateAverage(arr);
        System.out.println(result);

    }

}
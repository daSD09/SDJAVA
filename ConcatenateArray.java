public class ConcatenateArray {
    static int[] concatenate(int[] arr1, int[] arr2) {
        int[] result;
        int len1, len2;
        len1 = arr1.length;
        len2 = arr2.length;
        result = new int[len1 + len2];
        for (int i = 0; i < len1; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < len2; i++) {
            result[i + len1] = arr2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 7, 8, 9, 10 };
        int[] result = concatenate(arr1, arr2);
        for (int num : result)
            System.out.print(num + ",");
    }

}
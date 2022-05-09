public class MoveZeroEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 7, 8, 6, 4, 0, 0 };
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }

        }

        while (index < arr.length) {
            arr[index++] = 0;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}

public class MatrixAddition {
    static int[][] addition(int[][] arr1, int[][] arr2) {
        int[][] result;
        int columns, rows;
        rows = arr1.length;
        columns = arr1[0].length;
        result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        int[][] arr2 = { { 5, 6, 7, 8 }, { 1, 2, 3, 4 } };
        int[][] result = addition(arr1, arr2);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
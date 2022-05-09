
public class Fibbonacci {

    // static int n1=0,n2=1,n3=0;
    static void displayFibonacci(int count, int n1, int n2, int n3) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            displayFibonacci(--count, n1, n2, n3);
        }

    }

    public static void main(String[] args) {
        int count = 10, n1 = 0, n2 = 1, n3 = 0;
        System.out.print(n1 + " " + n2);
        displayFibonacci(count - 2, n1, n2, n3);
    }
}
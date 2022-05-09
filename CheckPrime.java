

public class CheckPrime {

    static String checkPrime(int num) {

        if (num == 0 || num == 1) {
            return (num + " is not a Prime Number");
        }

        for (int i = 2; i < (num / 2); i++) {
            if (num % i == 0) {
                return (num + " is not a Prime Number");
            }
        }

        return (num + " is a Prime Number");

    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 37;
        String response1 = checkPrime(num1);
        System.out.println(response1);
        String response2 = checkPrime(num2);
        System.out.println(response2);

    }
}
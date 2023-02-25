import java.util.Scanner;

public class PrimeNumber {

    // check if number is prime or not
    static boolean checkPrimeNo(int number) {
        int m = number / 2;

        for (int i = 2; i <= m; i++) {
            if (number == 0 || number == 1) {
                return false;
            } else if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        boolean isPrime = checkPrimeNo(number);

        if (isPrime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is Non-Prime");
        }
    }
}

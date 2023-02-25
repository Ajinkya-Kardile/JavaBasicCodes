import java.util.Scanner;

public class Factorial {

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int result = factorial(n);
        System.out.println("Factorial of "+ n+ " is: "+result);

    }
}

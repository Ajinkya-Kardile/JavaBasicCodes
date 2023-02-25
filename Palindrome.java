import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String original, reverse = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to check if it is a palindrome");
        original = sc.nextLine();
        sc.close();

        int length = original.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        if (original.equals(reverse))
            System.out.println("Entered value is a palindrome.");
        else
            System.out.println("Entered value is not a palindrome.");

    }
}

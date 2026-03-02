import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a palindrome:");
        String originalString = scanner.nextLine();

        // Normalize input (ignore case and spaces)
        originalString = originalString.replaceAll("\\s+", "").toLowerCase();

        // Use StringBuilder for efficient reverse
        String reversedString = new StringBuilder(originalString).reverse().toString();

        if (originalString.equals(reversedString)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}
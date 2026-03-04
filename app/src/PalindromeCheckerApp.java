import java.util.Scanner;
import java.util.Stack;

class PalindromeChecker {

    // Method to check if string is palindrome
    public boolean checkPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        // push all characters into stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // compare characters
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a palindrome:");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    // Method 1: Reverse String Method
    public static boolean reverseMethod(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }

    // Method 2: Stack Method
    public static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Method 3: Deque Method
    public static boolean dequeMethod(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Reverse Method Timing
        long start1 = System.nanoTime();
        boolean r1 = reverseMethod(input);
        long end1 = System.nanoTime();

        // Stack Method Timing
        long start2 = System.nanoTime();
        boolean r2 = stackMethod(input);
        long end2 = System.nanoTime();

        // Deque Method Timing
        long start3 = System.nanoTime();
        boolean r3 = dequeMethod(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");

        System.out.println("Reverse Method: " + r1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method: " + r2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Method: " + r3 +
                " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}
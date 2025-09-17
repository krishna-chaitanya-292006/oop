package tasks;

import java.util.Scanner;
import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Interning and == vs equals()
        String s1 = "Hello";
        String s2 = "Hello";              // Interned
        String s3 = new String("Hello");  // Not interned

        System.out.println("=== String Comparison ===");
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1.equals(s3): " + s1.equals(s3));

        // Demonstrating immutability
        String original = "Java";
        String modified = original.concat(" Programming");

        System.out.println("\n=== String Immutability ===");
        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + modified);

        // Array of Strings
        System.out.print("\nEnter number of strings: ");
        int n;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n <= 0) {
                    System.out.print("Please enter a positive number: ");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input, enter a number: ");
            }
        }

        String[] words = new String[n];

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        // Display original array
        System.out.println("\nOriginal array:");
        for (String word : words) {
            System.out.print(word + " ");
        }

        // Sort array
        Arrays.sort(words);
        System.out.println("\n\nSorted array:");
        for (String word : words) {
            System.out.print(word + " ");
        }

        // Reverse array
        System.out.println("\n\nReversed array:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        // Concatenate all strings
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append(" ");
        }
        System.out.println("\n\nConcatenated String: " + sb.toString().trim());

        sc.close();
    }
}

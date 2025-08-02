package basicprgs;

import java.util.Scanner;

public class Question_nine
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int and = num1 & num2;
        int or = num1 | num2;
        int xor = num1 ^ num2;
        int leftShift = num1 << 1;
        int rightShift = num1 >> 1;

        System.out.println("\n--- Bitwise Operations ---");

        System.out.println("Bitwise AND (&):");
        System.out.println("Decimal: " + and + ", Binary: " + Integer.toBinaryString(and));

        System.out.println("\nBitwise OR (|):");
        System.out.println("Decimal: " + or + ", Binary: " + Integer.toBinaryString(or));

        System.out.println("\nBitwise XOR (^):");
        System.out.println("Decimal: " + xor + ", Binary: " + Integer.toBinaryString(xor));

        System.out.println("\nLeft Shift (" + num1 + " << 1):");
        System.out.println("Decimal: " + leftShift + ", Binary: " + Integer.toBinaryString(leftShift));

        System.out.println("\nRight Shift (" + num1 + " >> 1):");
        System.out.println("Decimal: " + rightShift + ", Binary: " + Integer.toBinaryString(rightShift));

        scanner.close();
    }
}

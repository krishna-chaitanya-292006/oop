package basicprgs;

import java.util.Scanner;

public class Question_7
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        double average = (a + b + c) / 3.0;

        System.out.println("Average: " + average);

        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("b - c = " + (b - c));
        System.out.println("a * c = " + (a * c));
        System.out.println("a / 2 = " + (a / 2));
        System.out.println("c % 2 = " + (c % 2));

        System.out.println("\n--- Logical Operators ---");
        System.out.println("(a > b) && (b > c) = " + ((a > b) && (b > c)));
        System.out.println("(a < b) || (c > b) = " + ((a < b) || (c > b)));
        System.out.println("!(a == b) = " + !(a == b));

        System.out.println("\n--- Bitwise Operators ---");
        System.out.println("a & b = " + (a & b));  
        System.out.println("a | b = " + (a | b));  
        System.out.println("a ^ b = " + (a ^ b));  
        System.out.println("~a = " + (~a));        
        System.out.println("b << 1 = " + (b << 1)); 
        System.out.println("c >> 1 = " + (c >> 1)); 

        scanner.close();
    }
}

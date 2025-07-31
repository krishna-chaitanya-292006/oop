package basicprgs;

import java.util.Scanner;

public class Question_4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double doubleVal = scanner.nextDouble();

        int intVal = (int) doubleVal;

        System.out.println("Original double value: " + doubleVal);
        System.out.println("After casting to int  : " + intVal);

        scanner.close();
    }
}

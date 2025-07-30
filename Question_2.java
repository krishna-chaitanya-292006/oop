package basicprgs;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept student details
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Gender (M/F): ");
        char gender = scanner.next().charAt(0);

        System.out.print("Enter Percentage: ");
        float percentage = scanner.nextFloat();

        // Display formatted output
        System.out.println("\n------ Student Details ------");
        System.out.printf("Name       : %s%n", name);
        System.out.printf("Roll Number: %d%n", rollNumber);
        System.out.printf("Age        : %d%n", age);
        System.out.printf("Gender     : %c%n", gender);
        System.out.printf("Percentage : %.2f%%%n", percentage);

        scanner.close();
    }
}


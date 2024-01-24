package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a numerator: ");
        int numerator = input.nextInt();
        System.out.println("Please enter a denominator: ");
        int denominator = input.nextInt();
        Divide(numerator, denominator);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        studentFiles.put("Rocko", "CoolProgram.jsx");

        // Test out your CheckFileExtension() function!
        for (String student : studentFiles.keySet()) {
            String result = "Grade for " + student + ": " + CheckFileExtension(studentFiles.get(student));
            System.out.println(result);
        }
    }

    public static void Divide(int x, int y)
    {
        try {
            int grade = x / y;
            System.out.println("The student's grade is: " + grade);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0!");
            e.printStackTrace();
        }
    }

    public static boolean isEmptyOrNull(String str) {
        return str == null || str.isEmpty();
    }

    public static int CheckFileExtension(String fileName)
    {
        int grade;
        if (isEmptyOrNull(fileName)) {
            try {
                throw new FileExtensionException("File name cannot be empty");
            } catch (FileExtensionException e) {
                e.printStackTrace();
            } finally {
                grade = -1;
            }
        } else if (!fileName.endsWith(".java")) {
            grade = 0;
        } else {
            grade = 1;
        }
        return grade;
    }
}
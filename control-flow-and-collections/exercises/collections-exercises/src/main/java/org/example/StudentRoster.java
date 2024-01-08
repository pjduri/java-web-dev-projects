package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class StudentRoster {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        int newId = 1;
        String newStudent;
        do {
            System.out.println("Please enter new student name (or 'X' to quit): ");
            newStudent = input.next();
            if (!newStudent.equalsIgnoreCase("x")) {
                students.put(newId, newStudent);
                newId++;
            }
        } while (!newStudent.equalsIgnoreCase("x"));
        System.out.println(students);
    }

}

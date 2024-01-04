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


//    Make a program similar to GradebookHashMap that does the following:
//
//        It takes in student names and ID numbers (as integers) instead of names and grades.
//        The keys should be the IDs and the values should be the names.
//        Modify the roster printing code accordingly.

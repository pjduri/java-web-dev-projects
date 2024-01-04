package org.launchcode;

import java.util.Scanner;

import static java.lang.Double.isNaN;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle: ");
        if (input.hasNextDouble()) {
            double radius = input.nextDouble();
            double area = Circle.getArea(radius);

            System.out.println("The area of a circle with radius " + radius + " is " + area + ".");
            input.close();
        } else {
            System.out.println("WRONG!");
        }
    }

}

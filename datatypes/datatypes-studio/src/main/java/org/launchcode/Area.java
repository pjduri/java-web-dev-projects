package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);

        System.out.println("The area of a circle with radius " + radius + " is " + area + ".");
    }

}

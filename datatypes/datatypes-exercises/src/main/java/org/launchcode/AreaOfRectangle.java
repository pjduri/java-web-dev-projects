package org.launchcode;
import java.util.Scanner;
public class AreaOfRectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the length of the rectangle.");
        double length = input.nextDouble();

        System.out.println("Now enter its width");
        double width = input.nextDouble();

        System.out.println("The area of the rectangle is: " + length * width);

    }

}

package org.launchcode;
import java.util.Scanner;

public class FuelConsumption {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();

        System.out.println("How many gallons of fuel did it take to drive that far?");
        double gallons = input.nextDouble();

        System.out.println("You are getting " + miles / gallons + " miles per gallon.");

    }

}

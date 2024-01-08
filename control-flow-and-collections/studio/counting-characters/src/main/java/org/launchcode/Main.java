package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String exampleText = "If the product of two terms is " +
                "zero then common sense says at least one of the " +
                "two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that " +
                "can be factored allowing that side " +
                "of the equation to equal zero. Once " +
                "you’ve done that, it’s pretty straightforward from there.";

        System.out.println("Please enter some text: ");
        String textInput = input.nextLine();

        HashMap<Character, Integer> charCounts = new HashMap<>();
        for (char letter : textInput.toUpperCase().toCharArray()) {
//            if (charCounts.containsKey(letter)) {
//                charCounts.put(letter, charCounts.get(letter) + 1);
//            } else {
//                charCounts.put(letter, 1);
//            }
            charCounts.put(letter,
                    charCounts.containsKey(letter)
                            ? charCounts.get(letter) + 1
                            : 1);
        }

        for (Map.Entry<Character, Integer> count : charCounts.entrySet()) {
            if (Character.isAlphabetic(count.getKey())) {
                System.out.println(count.getKey() + ": " + count.getValue());
            }
        }

    }

}

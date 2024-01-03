package org.launchcode;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String aliceParagraph = "Alice was beginning to get very tired of sitting by her " +
                "sister on the bank, and of having nothing to do: once or twice she had " +
                "peeped into the book her sister was reading, but it had no pictures or " +
                "conversations in it, ‘and what is the use of a book,’ thought Alice " +
                "‘without pictures or conversation?’";

        System.out.println("Please enter a term to search: ");
        String searchTerm = input.nextLine();

        if (aliceParagraph.contains(searchTerm)) {
            System.out.println(searchTerm + " was found at index: " +
                    aliceParagraph.indexOf(searchTerm) + " and is " +
                    searchTerm.length() + "characters long.");

            String newParagraph = aliceParagraph.replace(searchTerm, "");
            System.out.println(newParagraph);

        }

    }

}

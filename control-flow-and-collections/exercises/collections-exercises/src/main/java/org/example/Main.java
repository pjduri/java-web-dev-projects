package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 1, 2, 3, 5, 8};

        for (int n : numbers) if (n % 2 > 0) System.out.println(n);

        String phrase = ("I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.");

        String[] words = phrase.split("\\.");
        System.out.println(Arrays.toString(words));

        ArrayList<Integer> nums = new ArrayList<>();
        for (int num : numbers) nums.add(num);
        nums.add(67);
        nums.add(12);
        nums.add(56);
        nums.add(9);
        nums.add(101);

        System.out.println("Sum total: "  + addNums(nums));

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word length to search: ");
        ArrayList<String> wordList = new ArrayList<>();
        Collections.addAll(wordList, phrase.split(" "));
        findStringByLength(wordList, input.nextInt());

    }

    public static int addNums(ArrayList<Integer> nums) {

        int total = 0;
        for (int num : nums) total += num % 2 == 0 ? num : 0;
        return total;

    }

    public static void findStringByLength(ArrayList<String> wordList, int wordLength) {

        System.out.println("Words of length " + wordLength + ":");
        for (String word : wordList) if (word.length() == wordLength) System.out.println(word);

    }

}
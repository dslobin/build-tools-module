package com.epam.btm;

import com.epam.btm.util.Utils;

public class App {
    private static final String QUESTION = "Are all numbers greater than zero?";
    private static final String POSITIVE_ANSWER = "Yes, they are";
    private static final String NEGATIVE_ANSWER = "No, they aren't";

    public static void main(String[] args) {
        boolean isAllNumbersPositive = Utils.isAllPositiveNumbers("12", "79");
        final String answer = isAllNumbersPositive ? POSITIVE_ANSWER : NEGATIVE_ANSWER;
        System.out.println(QUESTION + " - " + answer);
    }
}

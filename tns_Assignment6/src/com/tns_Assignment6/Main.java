package com.tns_Assignment6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder lowerPart = new StringBuilder();
        StringBuilder upperPart = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperPart.append(c);
            } else {
                lowerPart.append(c);
            }
        }

        System.out.println(lowerPart.toString() + upperPart.toString());
    }
}

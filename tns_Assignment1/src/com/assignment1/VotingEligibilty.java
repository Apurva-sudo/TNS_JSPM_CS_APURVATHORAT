package com.assignment1;
import java.util.Scanner;

public class VotingEligibilty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // for input

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are NOT eligible to vote.");
        }

        scanner.close();
    }
}

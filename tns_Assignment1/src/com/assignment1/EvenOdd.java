package com.assignment1;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // for input

        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // read user input

        // Check even or odd using modulo operator
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }

        scanner.close(); // close the scanner

	}

}

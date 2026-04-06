package week3;

import java.util.Scanner;

public class SumOddNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number > 0) {

            // Step 2: Create array from 1 to number
            int[] range = new int[number];

            for (int i = 0; i < range.length; i++) {
                range[i] = i + 1;
            }

            // Step 3: Sum odd numbers
            int sum = 0;

            for (int i = 0; i < range.length; i++) {
                if (range[i] % 2 != 0) {
                    sum += range[i];
                }
            }

            System.out.println("Sum of odd numbers is: " + sum);

        } else {
            System.out.println("Error: Please enter a positive number.");
        }

    }
}
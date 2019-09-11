package implement1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {

        int num1 = 0, num2 = 0, min = 1, max = 10000;
        ArrayList<Integer> primes = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        // Inputting of range
        System.out.println("Set the range by entering of two numbers!");
        do {
            System.out.println("Please, enter first number between " + min + " and " + max + ":");
            try {
                num1 = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("ERROR! You had entered not an integer or very large number.");
                in.nextLine();
            }
        } while (num1 <= min || num1 >= max);
        do {
            System.out.println("Please, enter second number between " + num1 + " and " + max + ":");
            try {
                num2 = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("ERROR! You had entered not an integer or very large number.");
                in.nextLine();
            }
        } while (num2 <= num1 || num2 > max);

        // Searching of primes
        for (int i = num1; i <= num2; i++) {
            int counter = 0; // dividers' counter
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) { // if was only 2 dividers - it is a prime
                primes.add(i);
            }
        }

        // Outputting of results
        if (primes.size() == 0) {
            System.out.print("Between " + num1 + " and " + num2 + " primes not found!");
        } else {
            System.out.print("Prime numbers between " + num1 + " and " + num2 + ": ");
            for (int prime : primes) {
                System.out.print(prime + " ");
            }
            System.out.print("\nCount = " + primes.size());
        }
    }
}

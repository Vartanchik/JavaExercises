package w3resource;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Your name: ");
        String name = in.nextLine();

        System.out.println("Hello\n" + name);
    }
}

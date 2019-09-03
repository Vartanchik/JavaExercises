package w3resource;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = in.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}

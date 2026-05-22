package PracticeOne;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        final float PI = 3.1416F;

        double a  = PI * r * r;

        System.out.println("Area Is : " + a);

    }
}

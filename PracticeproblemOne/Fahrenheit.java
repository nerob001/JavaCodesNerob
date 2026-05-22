package PracticeOne;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter celsius : ");
        double C = sc.nextDouble();

        double f = (9/5.0F * C) + 32;
        System.out.println("Fahrenheit : " + f);

    }
}

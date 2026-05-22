package PracticeOne;

import java.util.Scanner;

public class EquilateralTri {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        double area = Math.sqrt(3)/4.0 * a * a;
        System.out.println(area);

    }

}

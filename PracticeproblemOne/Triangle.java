
package PracticeOne;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Area is : " + area);

    }
}


package PracticeOne;

import java.util.Scanner;

public class volume {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        final float PI = 3.1416F;

        double volume = 4/3.0F * PI * radius  * radius * radius;

        System.out.println("Volume is : "  + volume);
    }
}

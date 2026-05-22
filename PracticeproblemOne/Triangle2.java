package PracticeOne;

import java.util.Scanner;

public class Tri {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double s = (a+b+c)/2.0;
        System.out.println(s);

        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area is : " + area);


    }
}

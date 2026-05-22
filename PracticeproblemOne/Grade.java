package PracticeOne;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter : ");
        int num = sc.nextInt();

        switch(num/10){

            case 10:
            case 9:

                System.out.println("A+");
                break;

            case 8:

                System.out.println("A");
                break;

            case 7:

                System.out.println("A-");
                break;

            case 6:

                System.out.println("B");
                break;

            case 5:
            case 4:

                System.out.println("C+");
                break;

            default:
                System.out.println("F");

        }
    }
}

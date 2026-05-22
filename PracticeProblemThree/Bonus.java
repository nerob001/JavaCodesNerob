package PracticeThree;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double sales = sc.nextDouble();
        double attend = sc.nextDouble();

        if(sales>=95) {

            if (attend == 100) {

                System.out.println("Bonus = 60% ");

            } else if (attend >= 90) {

                System.out.println("Bonus = 40% ");

            } else {

                System.out.println("Bonus = 5% ");

            }

        }

            else if(sales >= 80){

                if(attend == 100){

                    System.out.println("Bonus = 40% ");

                }

                else if(attend >= 90){

                    System.out.println("Bonus = 20% ");

                }

                else{

                    System.out.println("Bonus = 5% ");

                }

        }

            else{

            System.out.println("Bonus = 5% ");

        }

    }
}

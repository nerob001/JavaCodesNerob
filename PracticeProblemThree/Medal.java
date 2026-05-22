package PracticeThree;

import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CGPA : ");
        double CGPA = sc.nextDouble();
        System.out.println("Semster complete or not : ");
        boolean flag = sc.nextBoolean();

        if(flag){

            if(CGPA>=3.5){

                System.out.println("Medal Awarded");

            }

            else{

                System.out.println("No medal CGPA is low");

            }

        }

        else{

            System.out.println("No medal semster is imcomplete");

        }

    }

}

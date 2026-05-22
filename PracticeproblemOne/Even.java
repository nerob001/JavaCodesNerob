package PracticeOne;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter : ");
        int n = sc.nextInt();

        if(n%2 == 0){

            System.out.println("Even number");

        }

        else{

            System.out.println("Odd number");

        }
    }
}

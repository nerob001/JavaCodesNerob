package PracticeOne;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter symbol : ");
        char ch = sc.next().charAt(0);

        if(ch == '+'){

            System.out.println(a+b);

        }

        else if(ch == '-'){

            System.out.println(a-b);

        }

        else if(ch == '*'){

            System.out.println(a*b);

        }

        else if(ch == '/'){

            System.out.println(a/b);

        }

        else{

            System.out.println("Invlid operation");

        }

    }
}

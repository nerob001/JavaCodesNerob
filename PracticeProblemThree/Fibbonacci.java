package PracticeThree;

import java.util.Scanner;

public class fibonaaci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");

        for(int i = 2;i<=n;i++){

            int sum = a+b;
            a = b;
            b = sum;

            System.out.print(b +  " ");

        }


    }
}

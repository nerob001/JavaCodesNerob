package PracticeThree;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<=1){

            System.out.println("Not prime number");
            return;

        }

        boolean flag = true;

        for(int i = 2;i*i<=n;i++){
            if(n%i == 0){

                flag = false;
                break;

            }
        }

        if(flag){

            System.out.println("Prime NUmber");

        }

        else{

            System.out.println("Not Prime Number");

        }

    }
}

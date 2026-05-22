package PracticeTwo;

import java.util.Scanner;

public class evenP {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n =  sc.nextInt();

        int evens1 = 0 , evens2 = 0 , evens3 = 0;

        for(int i = 1;i<=n;i++){
            if(i%2 == 0){

                evens1 += i;

            }
        }

        System.out.println(evens1);

        int j = 2;
        while(j<=n){

            evens2 += j;
            j +=2;

        }

        System.out.println(evens2);

        int k = 2;

        do{

            evens3 += k;
            k += 2;

        }while(k<=n);

        System.out.println(evens3);


    }
}

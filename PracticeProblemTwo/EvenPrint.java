package PracticeTwo;

import java.util.Scanner;

public class evenP {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n =  sc.nextInt();

        for(int i = 1;i<=n;i++){
            if(i%2 == 0){

                System.out.print(i+" ");

            }
        }

        System.out.println();

        int j = 2;
        while(j<=n){

            System.out.print(j+" ");
            j +=2;

        }

        System.out.println();

        int k = 2;

        do{

            System.out.print(k + " ");
            k += 2;

        }while(k<=n);




    }
}

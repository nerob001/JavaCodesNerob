package PracticeTwo;

import java.util.Scanner;

public class oddP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();

        int odds1 = 0,odds2 = 0,odds3 = 0;

        for(int i = 1;i<=n;i++){
            if(i%2 != 0){

                odds1 += i;

            }
        }

        System.out.println(odds1);

        int j = 1;
        while(j<=n){

            odds2 += j;
            j +=2;

        }

        System.out.println(odds2);

        int k = 1;

        do{

            odds3 += k;
            k += 2;

        }while(k<=n);

        System.out.println(odds3);


    }
}

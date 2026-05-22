package PracticeThree;

import java.util.Scanner;

public class StoreVal {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i<n;i++){

            arr[i] = sc.nextInt();

        }

        double sum = 0;

        for(int val : arr){

            sum += val;


        }

        double avg = sum/n;

        System.out.println("Average value : "+avg);
    }
}

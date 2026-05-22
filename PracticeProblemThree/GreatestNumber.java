package PracticeThree;

import java.util.Scanner;

public class MaxMIn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i<n;i++){

            arr[i] = sc.nextInt();

        }

        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;

        for(int i = 0;i<n;i++){

            if(arr[i]>mx){

                mx = arr[i];

            }

            if(arr[i] < mn){

                mn = arr[i];

            }

        }

        System.out.println(mx + " " + mn);

    }
}

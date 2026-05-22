package FInalPracticeForLab;

import java.util.Scanner;

public class input {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.nextLine();
        System.out.println(s);

        char[] arr = s.toCharArray();

        int i = 0 , j = s.length()-1;

        while(i<j){

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;

        }

        for(char ch : arr){

            System.out.print(ch);

        }


    }
}

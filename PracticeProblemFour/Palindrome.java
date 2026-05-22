package FInalPracticeForLab;

public class palindrome {

    public static void main(String[] args) {

        String s = "abcecba";
        char [] arr = s.toCharArray();
        boolean flag = true;
        int i = 0 , j = arr.length -1;

        while(i<=j){

            if(arr[i] != arr[j]){

                flag = false;
                break;

            }

            else{

                i++;
                j--;

            }

        }

        if(flag){

            System.out.println("Palindrome");

        }

        else{

            System.out.println("Not Palindrome");

        }
    }
}

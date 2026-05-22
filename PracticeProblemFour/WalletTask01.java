package WalletDemo;

public class Task1 {

    public static double deposite(double balance,double amount){

        return balance + amount;

    }

    public static double withdraw(double balance,double amount){

        if(balance< amount){

            System.out.println("Insufficient balance");

            return balance;

        }

        return balance - amount;

    }
    public static void main(String[] args) {

        double balance_1 = 1200;
        double balance_2 = 1500;

        // deposite & withdraw

        balance_1 = deposite(balance_1,300);
        System.out.println("Balance after deposit : " + balance_1);

        balance_1 = withdraw(balance_1,200);
        System.out.println("Balance after withdraw : " + balance_1);

        // withdraw

        balance_2 = withdraw(balance_2,100);
        System.out.println("Balance after withdraw :" + balance_2);

    }

}

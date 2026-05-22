package WalletDemo;
class Wallet{

    private double balance;

    public Wallet(){

        this.balance = 0;

    }

    public Wallet(double balance){

        this.balance = balance;

    }

    public void deposit(double amount){

        this.balance += amount;

    }

    public void withdraw(double amount) {

        if (amount > this.balance) {

            System.out.println("Insufficient Balance");

        }

        else {

            this.balance -= amount;

        }

    }

    public double getter(){

        return this.balance;

    }

}
public class task2 {

    public static void main(String[] args) {

        Wallet w1 = new Wallet(100);
        Wallet w2 = new Wallet();

        w1.deposit(50);
        System.out.println("Balance of w1 : "  + w1.getter());
        w1.withdraw(30);
        System.out.println("Balance of w1 : "  + w1.getter());
        w2.deposit(50);
        System.out.println("Balance of w2 : "  + w2.getter());

    }




}

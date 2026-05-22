package WalletDemo;

class Wallet2{

    private double balance;
    private static int counter = 0; // static counter for unique id
    private final int id;

    public Wallet2(){

        this.balance = 0;
        this.id = ++counter;

    }

    public Wallet2(double balance){

        this.balance = balance;
        this.id = ++counter;

    }

    public void deposit(double amount){

        this.balance += amount;

    }

    public void withdraw(double amount){

        if(amount > this.balance){

            System.out.println("Insufficient funds");

        }

        else{

            this.balance -= amount;

        }

    }

    public double GetBalace(){

        return this.balance;

    }

    public int Getid(){

        return this.id;

    }

    public int GetCounter(){

        return counter;

    }


}
public class Rask3 {
    public static void main(String[] args) {

        Wallet2 w1 = new Wallet2();
        Wallet2 w2 = new Wallet2();
        Wallet2 w3 = new Wallet2(100);

        w1.deposit(230);
        w1.withdraw(250);
        w2.deposit(500);
        w2.withdraw(450);
        w3.withdraw(80);

        System.out.println(w1.GetBalace() + " " + w1.Getid());
        System.out.println(w2.GetBalace() + " " + w2.Getid());
        System.out.println(w3.GetBalace() + " " + w3.Getid());
        System.out.println(w3.GetCounter());
    }
}

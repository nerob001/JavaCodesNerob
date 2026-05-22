package WalletDemo;
class Wallet4{

    private double balance;
    private int id;
    private static int counter = 0;

    public Wallet4(){

        this.balance = 0;
        this.id = ++counter;

    }

    public Wallet4(double balance){

        this.balance = balance;
        this.id = ++counter;

    }

    public void deposit(double amount){

        this.balance += amount;

    }

    public void withdraw(double amount){

        if(amount > balance){

            System.out.println("Insufficient funds");

        }

        else{

            this.balance -= amount;

        }

    }

    public double GetBal(){

        return this.balance;

    }

    public int GetID(){

        return this.id;

    }

    public int GetCounter(){

        return counter;

    }

    public static void addBonus(Wallet4 w,double amount){

        w.deposit(amount);
        System.out.println("Wallet " + w.GetID() + " received bonus: $" + amount);

    }

    public static void swap(Wallet4 w1,Wallet4 w2){

        Wallet4 temp = w1;
        w1 = w2;
        w2 = temp;

    }


}
public class Task5 {
    public static void main(String[] args) {

        Wallet4 w1 = new Wallet4(450);// 950
        Wallet4 w2 = new Wallet4(500); // 1100

        Wallet4.addBonus(w1,500);
        System.out.println("Balance = " + w1.GetBal() + " Wallet Id : " + w1.GetID());
        Wallet4.addBonus(w2,600);
        System.out.println("Balance = " + w2.GetBal() + " Wallet Id : " + w2.GetID());

        System.out.println("before swapping : W1 ID is " + w1.GetID() + " && " + "W2 ID is " + w2.GetID());
        Wallet4.swap(w1,w2);
        System.out.println("After swapping  Wallet Id 1 = " + w1.GetID() + " Wallet Id 2 : " + w2.GetID());
        System.out.println(" W1 Balance = " + w1.GetBal() + "  W2 Balance : " + w2.GetBal());


    }
}

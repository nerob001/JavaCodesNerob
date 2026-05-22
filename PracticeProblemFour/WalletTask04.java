package WalletDemo;
class Wallet3{

    private double balance;
    private static int counter;
    private final int id;
    private String LastMethod;

    public Wallet3(){

        this.balance = 0;
        this.id = ++counter;
        this.LastMethod = "N/A";

    }

    public Wallet3(double balance){

        this.balance = balance;
        this.id = ++counter;
        this.LastMethod = "N/A";

    }

    public void deposit(double amount){

        this.balance += amount;
        System.out.println("Wallet " + id + ": Deposited $" + amount);

    }

    public void withdraw(double amount){
        withdraw(amount,"Normal");

    }

    public void withdraw(double amount,String mode){

        if(amount>this.balance){
            System.out.println("Insufficient funds");

        }

        else{

            this.balance -= amount;
            this.LastMethod = mode;

        }

    }

    public double GetBal(){

        return this.balance;

    }

    public double GetID(){

        return this.id;

    }

    public String GetLastWithdrawMode(){

        return this.LastMethod;

    }

    public int GetCounter(){

        return counter;

    }


}
public class Task4 {
    public static void main(String[] args) {

        Wallet3 w1 = new Wallet3(150);
        Wallet3 w2 = new Wallet3(500);

        // Normal withdrawal
        w1.withdraw(50);
        // Withdrawal via ATM
        w2.withdraw(20, "ATM");
        // Attempt insufficient balance
        w2.withdraw(100, "ONLINE");

        System.out.println("Wallet " + w1.GetID() + " last withdraw mode: " + w1.GetLastWithdrawMode() + " Balance_1 " + w1.GetBal());
        System.out.println("Wallet " + w2.GetID() + " last withdraw mode: " + w2.GetLastWithdrawMode() +  " Balance_2 " + w2.GetBal());
        System.out.println(w2.GetCounter());
    }
}

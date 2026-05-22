package SemsterFinal;

public class Car {

    String owner;
    String brand;
    String serialNo;
    double fuelLevel;
    boolean isRunning;

    Car(String owner, String brand, String serialNo, double fuelLevel) {

        this.owner = owner;
        this.brand = brand;
        this.serialNo = serialNo;
        this.fuelLevel = fuelLevel;
        this.isRunning = false;
    }

    void start() {

        if(!isRunning) {

            isRunning = true;
            System.out.println("Car has been started");

        }

        else{

            System.out.println("Car has already been started");

        }

    }

    void stop() {

        if(isRunning) {

            isRunning = false;

            System.out.println("Car has been stopped");

        }

        else{

            System.out.println("Car has already been stopped");

        }

    }

    void checkFuel(){

        System.out.println("Fuel level is : " + fuelLevel + "Liters") ;

    }

    void reFuel(double amount){

        fuelLevel += amount;

        System.out.println(amount+" liters added "+"Total Fuel level is : " + fuelLevel + "Liters") ;

    }

    void showDetails(){

        System.out.println("Owner : " + owner);
        System.out.println("Brand : " + brand);
        System.out.println("Serial No : " + serialNo);
        System.out.println("Fuel Level : " + fuelLevel);

    }

    public static void main(String[] args){

        Car c1 = new Car("Sasuke","Audi","123xyz",20);
        c1.start();
        c1.reFuel(20);
        c1.showDetails();

    }
}

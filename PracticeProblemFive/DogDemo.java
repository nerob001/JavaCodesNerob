package SemsterFinal;
class Dog{

    String name;
    int age;
    String breed;
    boolean isHungry;
    Dog(String name,int age,String breed){
        this.name=name;
        this.age=age;
        this.breed=breed;
        this.isHungry=false;

    }

    void bark(){
        System.out.println("Barking...");
    }

    void spin(){
        System.out.println("Spinning...");
    }

    void run(){
        System.out.println("Running...");
    }

    void feed(){

        if(isHungry){

            isHungry=false;
            System.out.println(name + " has been fed");

        }

        else{

            System.out.println(name + " is not hungry right now");

        }
    }

    void display(){

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);

    }


}
public class DogDemo {
    public static void main(String[] args) {

        Dog d1=new Dog("Dog1",23,"Brown");
        d1.bark();
        d1.spin();
        d1.isHungry = true;
        d1.feed();
        d1.display();
    }
}

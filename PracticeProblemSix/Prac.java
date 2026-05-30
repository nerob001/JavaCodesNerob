package PracticeProblem06;

class Books{

    int bookId;
    String bookName;
    String bookAuthor;
    String yearOfPub;
    float price;
    String status;

    void addNewBooks(){
        System.out.println("Book added");
    }

    void deleteBooks(){
        System.out.println("Book deleted");
    }

    void displayBookDetails(){
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Year: " + yearOfPub);
        System.out.println("Price: " + price);
        System.out.println("Status: " + status);
    }

    void inquiryBook(){
        System.out.println("Book inquiry");
    }

}

class Librarian{

    int id;
    String name;

    void searchBook(String name){
        System.out.println("Searching: " + name);
    }

    boolean verifyMember(int id){
        return true;
    }

    void orderBooks(){
        System.out.println("Books ordered");
    }

    void sellBooks(){
        System.out.println("Book sold");
    }

}

class Publisher{

    int id;
    String name;
    String address;
    int phoneNo;

    void addPub(){
        System.out.println("Publisher added");
    }

    void modifyPub(){
        System.out.println("Publisher modified");
    }

    void deletePub(){
        System.out.println("Publisher deleted");
    }

    void orderStatus(){
        System.out.println("Checking order status");
    }

}

class User{

    int userId;
    String userName;
    String userAddress;
    int phoneNo;

    void returnBooks(){
        System.out.println("Book returned");
    }

    int payFine(String dt){
        return 0;
    }

    void addNewUser(){
        System.out.println("User added");
    }

    void deleteUser(){
        System.out.println("User deleted");
    }

    void updateDetails(){
        System.out.println("User details updated");
    }

    void bookPurchase(){
        System.out.println("Book purchased");
    }

}

public class prac {

    public static void main(String[] args) {
        Books b = new Books();
        b.bookId = 101;
        b.bookName = "Java Programming";
        b.bookAuthor = "Draganeel";
        b.yearOfPub = "2026";
        b.price = 500;
        b.status = "Available";

        b.displayBookDetails();

        User u = new User();
        u.userName = "Itachi";
        u.bookPurchase();
    }
}

package PracticeFour;

public class ECommerce {

    public void filterProduct(String catagory){

        System.out.println("Searching for product in catagory " + catagory);

    }

    public void filterProduct(double minPrice,double maxPrice){

        System.out.println("Searching for product with Price between $ " + minPrice + "to $" + maxPrice);

    }

    public void filterProduct(String Brand,boolean isBrand){

        System.out.println("searching for product of brand " + Brand);

    }

    public void filterProduct(String catagory,double minPrice,double maxPrice){

        System.out.println("Searching for product in catagory "+ catagory +  " with Price between $ " + minPrice + " to $" + maxPrice);

    }

    public void filterProduct(String catagory,double minPrice,double maxPrice,String Brand){

        System.out.println("Searching for product in catagory"+ catagory +" of brand " + Brand +  " with Price between $ " + minPrice + " to $" + maxPrice);

    }

    public static void main(String[] args) {

        ECommerce e1 = new ECommerce();
        e1.filterProduct("fashion");
        e1.filterProduct(10.0,100);
        e1.filterProduct("Apple",true);
        e1.filterProduct("electronics",12000,120000);
        e1.filterProduct("fashion",230000,3456000,"Nike");

    }
}

package exam_preparation;


interface student{
    String name = "Fahmida Yeasmin";
    int roll = 451628;
    String favourite_drink = "Coffee";
    String favourite_snacks = "Parched rice";


    void printData();
}


class display implements student{
    public void printData(){
        System.out.println("Name is: " + name);
        System.out.println("Roll is: " + roll);
        System.out.println("Favourite Drink is: " + favourite_drink);
        System.out.println("Favourite Snacks is: " + favourite_snacks);
    }
}


public class interface_programme {
    public static void main(String[] args) {
        display obj = new display();

        obj.printData();
    }
}

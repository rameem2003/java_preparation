package exam_preparation;

// Inheritance 

class student_info{
    String name = "Mahmood Hassan Rameem";
    int roll = 451638;
}


class others_info extends student_info{
    String best_friend_name1 = "Fahmida Yeasmin";
    String best_friend_name2 = "Mahabul alam";

    double CGPA = 3.88;
    double fahmida_CGPA = 3.77;


    void printData(){
        System.out.println("My name is: " + name);
        System.out.println("My roll is: " + roll);
        System.out.println("My best friends: " + best_friend_name1 + " and " + best_friend_name2);
        System.out.println("My CGPA is: " + CGPA);
        System.out.println("Fahmida CGPA is: " + fahmida_CGPA);
    }

}


public class inheritance {
    public static void main(String[] args) {
        others_info obj = new others_info();
        obj.printData();
    }
}

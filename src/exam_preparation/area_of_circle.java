package exam_preparation;
import java.util.Scanner;

// Area of circle

class circle{
    public double area(double radias){
        double result = Math.PI * radias * radias;
        return result;
    }
}

public class area_of_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        circle obj = new circle();

        System.out.print("Enter Radias: ");
        double radias = input.nextDouble();

        double final_area = obj.area(radias);

        System.out.println("Area of circle is: " + final_area + " Sqr unit");
    }
}

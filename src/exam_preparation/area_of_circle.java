package exam_preparation;

import java.util.Scanner;

class circle{
    double area(double radias){
        double result = Math.PI * radias * radias;
        return result;
    }
}

public class area_of_circle {
    public static void main(String[] args) {
        circle obj = new circle();
        Scanner in = new Scanner(System.in);


        System.out.print("Enter the radias: ");
        double r = in.nextDouble();

        double result =  obj.area(r);

        

        System.out.println("Area of circle is: " + result);
    }
}

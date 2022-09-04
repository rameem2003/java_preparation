
package exam_preparation;

public class Exam_preparation {

    public static void main(String[] args) {
        // Quadratic equation java program
        
        double a = 1;
        double b = 5;
        double c = 2;
        
        double d = (b*b) - (4 * a *c);
        
        if(d > 0){
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            
            System.out.println("X1 is : " + x1 + " X2 is : " + x2);
        }else if(d == 0){
            double x = (-b) / (2 * a);
            System.out.println("X is:" + x);
            
            
        }else{
            System.out.println("Error");
            
            
        }
    }
    
}


package exam_preparation;

import java.util.Scanner;

public class identify_big_number {
    // identify the big number form 3 numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter value of a: ");
        int a = input.nextInt();
        
        System.out.print("Enter value of b: ");
        int b = input.nextInt();
        
        System.out.print("Enter value of c: ");
        int c = input.nextInt();
        
        
        if(a > b && a > c){
            System.out.println("A is greater than B and C");
        }else if(b > c && b > a){
            System.out.println("B is greater than A and C");
        }else{
            System.out.println("C is greater than A and B");
        }
            
        
    }
}

package exam_preparation;


// factorial for loop

import java.util.Scanner;

public class factorial_for_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = input.nextInt();

        int fact = 1;


        for(int i = n; i >= 1; i--){
            fact = fact * i;
        }

        System.out.println("Factorial of " + n + " = " + fact);
    }
}


package exam_preparation;

import java.util.Scanner;


public class sum_of_series {
    public static void main(String[] args) {
        // Summision of series numbers
        
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        int i = 0;
        
        System.out.print("Enter number: ");
        int n = input.nextInt();
        
        
        while(i <= n){
            sum = sum + i;
            i = i + 2;
        }
        
        System.out.println(sum);
    }
}

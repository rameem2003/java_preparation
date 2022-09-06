package exam_preparation;

import java.util.Scanner;

public class identify_prime_number {
    // Identify the prime number

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        System.out.print("Enter any positive number: ");
        int num = input.nextInt(); // 17


        for(int i = 2; i < num; i++){
            if(num % i == 0){
                count++;
                break;
            }
        }


        if(count == 0){
            System.out.println(num + " is prime number");
        }else{
            System.out.println(num + " is not prime number");
        }
    }
}

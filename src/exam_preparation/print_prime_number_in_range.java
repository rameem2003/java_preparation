package exam_preparation;

import java.util.Scanner;

// Print prime number in range

public class print_prime_number_in_range {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the starting number: ");
        int start = input.nextInt(); // 20

        System.out.print("Enter the ending number: ");
        int end = input.nextInt(); // 30

        int count = 0;


        for(int i = start; i <= end; i++){


            for(int j = 2; j < i; j++){
                if(i%j == 0){
                    count++;
                    break;
                }
            }


            if(count == 0){
                System.out.println(i);
            }

            count = 0;
        }
    }
}

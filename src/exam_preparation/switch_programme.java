package exam_preparation;

import java.util.Scanner;

public class switch_programme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter number: ");
        int number = input.nextInt();

        int formate_number = number/10;


        switch (formate_number) {
            case 10:
                System.out.println("A+");
                break;
        
            case 9:
                System.out.println("A+");
                break;

            case 8:
                System.out.println("A+");
                break;

            case 7:
                System.out.println("A");
                break;

            case 6:
                System.out.println("A-");
                break;
            default:
                System.out.println("Fail");
                break;
        }
    }
}

import exception.ExceptionValue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{

            System.out.println("Enter an integer greater than 0: ");
            String input = sc.nextLine();

            int number = Integer.parseInt(input);

            if (number < 0){
                throw new ExceptionValue("Number less than 0!");
            }
            System.out.println("Number entered " + number);

        }catch(NumberFormatException | ExceptionValue exception){
            System.out.println("Error: Invalid entry! Please enter an integer and greater than 0");
        }
        finally {
            sc.close();
        }
    }
}
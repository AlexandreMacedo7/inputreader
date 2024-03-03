import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{

            System.out.println("Enter an integer: ");
            String input = sc.nextLine();

            int number = Integer.parseInt(input);

            System.out.println("Number entered " + number);

        }catch(NumberFormatException exception){
            System.out.println("Error: Invalid entry! Please enter an integer.");
        }
        sc.close();
    }
}
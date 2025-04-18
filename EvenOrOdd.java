import java.util.Scanner;

public class EvenOrOdd {
    // Definition of even or odd number
    // Even: is a number that be devided by 2 without a remainder
    // Odd number: is a number that cannot be divisible by 2

    // This Application accept an integer number from user and determines whether
    // it's Even or Odd number
    public static void main(String[] args) {

        // Collect input from user
        Scanner scan = new Scanner(System.in);

        // Get input from the User
        System.out.println("Enter an Integer Number");
        int numberInput = scan.nextInt();

        // Check the number if it is even or odd number
        // if (numberInput % 2 == 0) {
        //     System.out.println(numberInput + " " + " is an EVEN number");
        // } else {
        //     System.out.println(numberInput + "  " + " is an ODD number");
        // }

        // Ternary Operator Use case for Even or Odd number
        // condition ? value_if_true : value_if_false;

        String result = (numberInput % 2 == 0) ? numberInput + " " + " is an EVEN number"
                : numberInput + "  " + " is an ODD number";
        System.out.println(result);


    }
}

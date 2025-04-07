import java.util.Scanner;

public class RootOfEquation {

    public static void main(String[] args) {

        // x^2+8x+4
        // -b+- sqrt(b^2 -4ac) / 2a
        // discriminant = b*b -4*a*c;
        // root1 = (-b + sqrt(discriminant))/(2*a)
        // root2 = (-b - sqrt(discriminant))/(2*a)

        // Collect Input from User
        Scanner input = new Scanner(System.in);

        // Prompt User to insert the value of a
        System.out.println("Enter the Value of a: ");
        double a = input.nextDouble();

        // Prompt user to insert the value of b
        System.out.println("Enter the value of b: ");
        double b = input.nextDouble();

        // Prompt User to insert thw value of c:
        System.out.println("Enter the value of c: ");
        double c = input.nextDouble();

        // Close the scanner to avoid resource leak
        input.close();

        // Check if it's a quadratic Equation (a must not be 0)
        if (a == 0) {
            System.out.println("This is not a quadratic equation");
            return;
        }

        // Calaculate the discriminant B^2 -4ac
        double discriminant = (b * b) - (4 * a * c);

        // Compute the roots based on the discriminant
        if ((discriminant > 0)) {
            // Two Distinct real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("The Equation has two real roots:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);

        } else if (discriminant == 0) {
            // One real root
            double root = -b / (2 * a);
            System.out.println("The Equation has one real root");
            System.out.println("Root = " + root);
        } else {
            // Complex Roots
            double realPart = (-b + Math.sqrt(discriminant)) / (2 * a);
            double imaginaryPart = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("The equation has two comnplex roots");
            System.out.println("Root 1: " + realPart);
            System.out.println("Root 2: " + imaginaryPart);
        }

    }

}

public class Home {
    public static void main(String[] args) {
       
        int num = 10;
        int num1 = 20;

        int sumTwoVariables = num + num1;
        System.out.println(sumTwoVariables);

        /*
         * * * Rules for Declaring Variables in Java
         * 1. Variable names in Java can have (A-Z), (a-z), (_$)
         * 2. Characters like(@, -, &, !, etc)
         * 
         * 3. Reserved Words are not acceptable by java when naming variable names
         * e.g(class, if, else, while, for, true)
         *
         * 5. Java is Case Sensitive
         */

        int sumOfTwoVariables;
        int SUMOFTWOVARIABLE;
        
        // sumOfTwoVariables != SUMOFTWOVARIABLE;


        /*
         * 6. Follow Best Practice when na,ing vriables in java e.g
         */

        string myVariableName; // using Camel casing
        int sumOF3Variables; // Using Camel casing

        /*
         * 7. Variables must have a valid Datatype
         */
        int x;
        double y;
        String xyz;

        /*
         * Variables can be initialized during declaration. e.g:
         */
        int newVal = 2;
        int secondVal = 4;
        double valVariable = 33121222.43235;
        float smallVarible = 2.5;
    }
}
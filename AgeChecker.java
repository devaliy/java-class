public class AgeChecker {
    
    public static void main(String[] args) {
        int age = 22;

        //Using Ternary Operator to check the age eligibility
        String eligibility = (age >= 18) ? "Eligible to Vote" : "You are not Eligible to Vote";
        System.out.println(eligibility);
    }

}

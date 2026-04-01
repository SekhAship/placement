package basic1;

public class factorial {
    //factorial code
    public static void fact(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);

    }
}

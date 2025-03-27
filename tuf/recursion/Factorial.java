import java.util.*;
public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }else if(n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
}
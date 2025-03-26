// package basic;
import java.util.Scanner;
public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                // Add divisor i to the list
               count++;

                // Add the counterpart divisor
                // if it's different from i
                if (i != num / i) {
                    // Add the counterpart
                    // divisor to the list
                    count++;
                }
            }
        }
        System.out.println("Number of divisors: " + count);
    }
}

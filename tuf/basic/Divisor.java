// package basic;
import java.util.Scanner;
public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= num/2; i++) {
            if(num % i == 0) {
                count++;
            }
        }
        System.out.println("Number of divisors: " + (count+1));
    }
}

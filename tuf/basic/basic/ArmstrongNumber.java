// package basic;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        double sum = 0;
        while(num > 0) {
            int rem = num % 10;
            sum = sum + Math.pow(rem, 3);
            num = num / 10;
        }
        if(sum == temp) {
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not an Armstrong number");
        }
    }
}

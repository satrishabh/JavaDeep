// package basic;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        for(int i = 1; i <= Math.sqrt(num); i++) {

            // If n is divisible by i
            // without any remainder.
            if(num % i == 0){ 

                // Increment the counter.
                count = count + 1;

                // If n is not a perfect square,
                // count its reciprocal factor.
                if(num / i != i){
                    count = count + 1;
                }
            }
        }

        // If the number of
        // factors is exactly 2.
        if(count == 2){
             // Return true, indicating
             // that the number is prime.
            System.out.println("Prime Number");;
        }
        // If the number of
        // factors is not 2.
        else{ 
            // Return false, indicating
            // that the number is not prime.
            System.out.println("Not a Prime Number");; 
        }
    }
}

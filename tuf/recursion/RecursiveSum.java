import java.util.Scanner;
public class RecursiveSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println("Sum of first "+n+" natural numbers is: "+sum(n));
    }
    private static int sum(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}

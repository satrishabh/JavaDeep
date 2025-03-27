import java.util.Scanner;

public class Ntimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n=sc.nextInt();

        printNtimes(n);
        sc.close();
    }
    private static void printNtimes(int n){
        if(n==0){
            return;
        }
        if(n==1){
            System.out.print("1"+" ");
            return;
        }
        System.out.print(n+ " ");
        printNtimes(n-1);
    }
}

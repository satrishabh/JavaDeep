import java.util.Scanner;

public class NtimesAsc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        printNtimes(1,n);
    }
    private static void printNtimes(int i,int n){
        if(n==0){
            return;
        }
        if(n==i){
            System.out.print(n);
            return;
        }else if(n>i){
            System.out.print(i+" ");
            printNtimes(i+1,n);
        }

    }

}

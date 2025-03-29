
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String pal1=  sc.next();
        if(palindrome(pal1,0))
            System.out.println(pal1+" is palindrome");
        else
            System.out.println(pal1+" is not palindrome");
    }
    
    private static boolean palindrome(String pal,int length){

        if(length>=pal.length()/2) return true;
        else if(pal.charAt(length)!=pal.charAt(pal.length()-length-1)) return false;
        return palindrome(pal,length+1);
    }
}

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibo(5));

    }
    private static int fibo(int n){
        if(n<=1)
            return n;
        return fibo(n-1) + fibo(n-2); 
    }
    
}

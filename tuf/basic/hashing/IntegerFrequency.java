import java.util.Arrays;
import java.util.Scanner;
class IntegerFrequency{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[] elements={1,2,3,5,2};
        int[] findFrequency={0,1,2,3,4};
        for(int frequency:findFrequency){
            System.out.print(bruteForce(frequency,elements)+" ");
        }
        System.out.println();
        hashStrategy(elements,findFrequency);
    }
    private static int bruteForce(int frequency, int[] elements){
        int count=0;
        for(int i=0;i<elements.length;i++){
            if(frequency==elements[i]){
                count++;
            }
        }
        return count;
    }
    private static void  hashStrategy(int[] elements, int[] frequency){
        int[] hash=new int[13];
        // finding
        for(int i=0;i<elements.length;i++){
            hash[elements[i]]++;
        }
        // fetching
        for(int i:frequency){
            System.out.print(hash[i]+" ");
        }
    }
}
import java.util.Comparator;
import java.util.Map;

public class ContMaxMinFrequency {
    public static void main(String[] args) {
        int A[]={12,23,43,23,12,3,4,5};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i])+1)
            } else{
                map.put(A[i],1);
            }
        }
        Comparator.comparingInt();
        System.out.println("max frequency number :");
        System.out.println("lowest frequenct number :");
    }
}

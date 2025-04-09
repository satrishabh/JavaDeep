import java.util.HashMap;
import java.util.Map;

public class CountFrequencyArray {
    public static void main(String[] args) {
        int A[]={15,5,6,15,5,4,7,4};
        int i,j;
        Map<Integer,Integer> variable=new HashMap<>();
        
        for(i=0;i<A.length;i++){
            if(variable.containsKey(A[i])){
                variable.put(A[i],variable.get(A[i])+1);
            }else{
                variable.put(A[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> map:variable.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }    
}

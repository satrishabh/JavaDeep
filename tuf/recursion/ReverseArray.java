public class ReverseArray {

    public static void main(String[] args) {
        Integer[] original={1,2,3,4,5};
        Integer[] reverse=new Integer[5];
        reverse(original,reverse,5);
        for (Integer num : reverse) {
            System.out.println(num);
        }
    }
    private static void reverse(Integer[] original,Integer[] reverse,Integer length){
        if(length==0){
            return;
        }
        reverse[original.length-length]=original[length-1];
        reverse(original,reverse,length-1);
    }
    
}

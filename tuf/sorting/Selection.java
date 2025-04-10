public class Selection {

    public static void main(String[] args) {
        int[] numbers={5,4,3,2,1};
        int temp;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]>numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        for(int number:numbers){
            System.out.println(number);
        }
    }
}

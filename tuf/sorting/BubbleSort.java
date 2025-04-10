public class BubbleSort {
    public static void main(String[] args) {
        int A[]={1,2,3,6,0,5};
        int temp;
        for(int i=A.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(A[j]>A[j+1]){
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
        for(int number:A){
            System.out.println(number);
        }
    }
}

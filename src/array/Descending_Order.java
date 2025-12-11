package array;

public class Descending_Order {
    public static void main(String[] args) {
        int ar[] = {3,2,1,4,5};
        int size=ar.length;

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(ar[i] < ar[j]){
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
            System.out.print(ar[i]+" ");
        }
    }
}

package array;

public class Ascending_Order {
    public static void main(String[] args) {
        int ar[] = {3,5,2,1};
        int size=ar.length;
        for(int j=0;j<ar.length;j++){
            for(int k=j+1;k<ar.length;k++){
                if(ar[j] > ar[k]){
                    int temp=ar[j];
                    ar[j]=ar[k];
                    ar[k]=temp;
                }
            }
            System.out.print(ar[j]+" ");
        }
    }
}

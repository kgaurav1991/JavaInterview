package array;

import java.util.Arrays;

public class Compare_Two_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int ar[] = {5,6};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<ar.length;j++){
                if(arr[i]==ar[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}

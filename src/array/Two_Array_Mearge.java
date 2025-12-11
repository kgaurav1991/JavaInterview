package array;

public class Two_Array_Mearge {
    public static void main(String[] args) {
        int ar[] = new int[]{1,2,3};
        int arr[] = new int[]{4,5};
        int size = ar.length+arr.length;
        int result[] = new int[size];

        for(int i=0;i<ar.length;i++){
           result[i]=ar[i];
        }
        for(int i=0;i<arr.length;i++){
            result[i+ar.length]=arr[i];
        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}

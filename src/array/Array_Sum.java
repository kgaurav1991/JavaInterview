package array;

public class Array_Sum {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4};
        int sum=0;
        for(int i=0;i<ar.length;i++) {
            sum += ar[i];
        }
        System.out.println(sum);
    }
}

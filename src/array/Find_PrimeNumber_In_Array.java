package array;

import java.util.Scanner;

public class Find_PrimeNumber_In_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Array Size: ");
        int num = sc.nextInt();

        int ar[] = new int[num];
        System.out.println("Enter the Array elements: ");
        for(int i=0;i<num;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=2;i<num;i++){
            boolean isPrime=false;
            for(int j=2;j<i;j++){
                if(ar[i]%ar[j] == 0){
                    isPrime=true;
                    break;
                }
            }
            if(!isPrime){
                System.out.println(ar[i]+" is Prime Number");
            }
        }
    }
}

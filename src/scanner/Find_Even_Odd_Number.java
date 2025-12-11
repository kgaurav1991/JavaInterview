package scanner;

import java.util.Scanner;

public class Find_Even_Odd_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Array Size: ");
        int num = sc.nextInt();

        int ar[] = new int[num];

        System.out.println("Enter The Number :");
        for(int a=0;a<num;a++){
            ar[a]=sc.nextInt();
        }

        for(int a=0;a<5;a++){
            if(ar[a]%2==0){
                System.out.println(ar[a]+" is Even Number");
            }else{
                System.out.println(ar[a]+" is Odd Number");
            }
        }
    }
}

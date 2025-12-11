package scanner;

import java.util.Scanner;

public class Array_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int size = sc.nextInt();
        int ar[] = new int[size];

        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Find the Array Reverse of : ");
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i] + " ");
        }
    }
}

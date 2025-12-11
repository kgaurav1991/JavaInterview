package scanner;

import java.util.*;

public class Duplicate_Remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        System.out.print("Enter the Array elements: ");
        for (int i = 0; i < num; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Find the Array Duplicate Values: ");
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < num; i++) {
            set.add(list.get(i));
        }
        System.out.print(set);


    }
}

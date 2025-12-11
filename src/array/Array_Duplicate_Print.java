package array;

import java.util.Arrays;

public class Array_Duplicate_Print {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,1,2};
        int index = 0;
        int result[] = new int[ar.length];

        for(int i=0;i<ar.length;i++){
            boolean isDuplicate = false;
            for(int j=0;j<index;j++){
                if(ar[i]==result[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate){
                continue;
            }
            int count = 0;
            for(int j=0;j<ar.length;j++){
                if(ar[i]==ar[j]){
                    count++;
                }
            }
            if
            (count > 1){
                System.out.println(ar[i]);
                result[index++]=ar[i];
            }
        }
    }
}

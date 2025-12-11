package array;

import java.util.Arrays;

public class Array_Duplicate_Remove {
    public static void main(String[] args) {
        /*
        int ar[] = {1,2,3,4,1,2,};
        int arr[] = Arrays.stream(ar).distinct().toArray();
        System.out.println(Arrays.toString(arr));
         */

        int ar[] = {1,2,3,4,1,2,};
        int index = 0;
        int result[] = new int[ar.length];

        for(int i=0;i<ar.length;i++){
            boolean isDuplicate = false;
            for(int j=0;j<ar.length;j++){
                if(ar[i]==ar[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                result[index++]=ar[i];
            }
            int uniqeArray[] = Arrays.copyOf(result,index);
            System.out.println(Arrays.toString(uniqeArray));
        }
    }
}

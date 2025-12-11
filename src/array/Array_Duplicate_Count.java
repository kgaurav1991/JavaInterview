package array;

import java.util.Arrays;

public class Array_Duplicate_Count {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,1,2};
        int index = 0;
        int result[] = new int[ar.length];

        for(int i=0;i<ar.length;i++){
            boolean isDuplicate = false;
            for(int j=0;j<index;j++){
                if(ar[i]==result[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                result[index++]=ar[i];
                int count = 0;
                for(int k=0;k<result.length;k++){
                    if(ar[k]==ar[i]){
                        count++;
                    }
                }
                System.out.println(ar[i]+" = "+count);
            }
        }
    }
}

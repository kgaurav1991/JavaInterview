package array;

public class Array_Know_Duplicate_Print {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,1,2,};

        for(int i=0;i<ar.length;i++) {
            boolean isDuplicate=false;
            for(int j=0;j<ar.length;j++) {
                if(ar[i]==ar[j] && (i != j)) {
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate) {
                System.out.print(ar[i]+" ");
            }
        }
    }
}

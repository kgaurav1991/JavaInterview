package array;

public class Zero_Shift_First_Index {
    public static void main(String[] args) {
        int ar[] = {0,1,0,2,0,0,3};
        int index = 0;
        int result[] = new int[ar.length];

        for(int i=0;i<ar.length;i++){
            if(ar[i]==0){
                result[index++]=ar[i];
            }
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]!=0){
                result[index++]=ar[i];
            }
        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}

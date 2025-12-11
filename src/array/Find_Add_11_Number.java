package array;

public class Find_Add_11_Number {
    public static void main(String[] args) {
        int ar[] = {1,3,5,6,7,8};
        int sum = 0;

        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                if(ar[i]+ar[j]==11){
                    sum=ar[i]+ar[j];
                    System.out.println(ar[i]+" + "+ar[j]+" = "+sum);
                }
            }
        }
    }
}

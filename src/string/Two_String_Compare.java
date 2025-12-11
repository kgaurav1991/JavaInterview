package string;

public class Two_String_Compare {
    public static void main(String[] args) {
        String str = "abc xyz def one two";
        String str1 = "xyz two";
        String ar[] = str.split(" ");
        String arr[] = str1.split(" ");

        for(int i=0;i<ar.length;i++){
            for(int j=0;j<arr.length;j++){
                if(ar[i].equals(arr[j])){
                    System.out.print(ar[i]+" ");
                }
            }
        }


    }
}

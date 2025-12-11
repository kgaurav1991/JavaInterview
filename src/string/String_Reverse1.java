package string;

public class String_Reverse1 {
    public static void main(String[] args) {
        String str = "Welcome To India";
        String str1 = " ";

        for(int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        System.out.println(str1);
    }
}

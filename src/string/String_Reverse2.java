package string;

public class String_Reverse2 {
    public static void main(String[] args) {
        String str = "Welcome To India";
        char[] s = str.toCharArray();

        for(int i=s.length-1;i>=0;i--){
            System.out.print(s[i]);
        }
    }
}

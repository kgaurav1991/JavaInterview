package string;

public class String_Reverse_WithOut_Using_ReverseMethod {
    public static void main(String[] args) {
        String str = "Welcome To India";
        String word[] = str.split(" ");
        StringBuffer result = new StringBuffer();

        for(String s : word){
            for(int i=s.length()-1;i>=0;i--){
                result.append(s.charAt(i));
            }
            result.append(" ");
        }
        System.out.println(result.toString());
    }
}

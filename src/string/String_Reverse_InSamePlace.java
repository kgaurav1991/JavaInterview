package string;

public class String_Reverse_InSamePlace {
    public static void main(String[] args) {
        String str = "Welcome To India";
        String word[] = str.split(" ");
        StringBuffer result = new StringBuffer();

        for(String s : word){
            StringBuffer sb = new StringBuffer(s);
            result.append(sb.reverse().append(" "));
        }
        System.out.println(result.toString());
    }
}

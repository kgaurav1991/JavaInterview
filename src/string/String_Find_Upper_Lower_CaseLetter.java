package string;

public class String_Find_Upper_Lower_CaseLetter {
    public static void main(String[] args) {
        String str = "Automation Engineer Computer Science";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'A'  && ch <= 'Z'){
                System.out.println(ch+" is Upper Case Letter");
            }
            else if(ch >= 'a' && ch <= 'z'){
                System.out.println(ch+" is Lower Case Letter ");
            }

        }
    }
}

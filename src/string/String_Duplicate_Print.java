package string;

public class String_Duplicate_Print {
    public static void main(String[] args) {
        String str = "abc xyz def one two one abc cat abc rat";
        String word[] = str.split(" ");
        String temp[] = new String[word.length];
        int index = 0;

        for (int i = 0; i < word.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (word[i].equals(temp[j])) {
                    isDuplicate = true;
                    break;   //1146966854
                }
            }
            if (isDuplicate) {
                continue;
            }
            int count = 0;
            for (int k = 0; k < word.length; k++) {
                if (word[i].equals(word[k])) {
                    count++;
                }
            }
            if(count > 1){
                System.out.println(word[i]);
                temp[index++] = word[i];
            }
        }

    }
}

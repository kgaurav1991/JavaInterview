package string;

public class Special_Character_Not_Reverse {
    public static void main(String[] args) {
        String str = "auto@$ma*&tion";
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length-1;

        while(left<right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if (Character.isLetter(arr[0])) {
                arr[0] = Character.toLowerCase(arr[0]);
            }
        }
        String st = new String(arr);
            System.out.print(st);
    }
}

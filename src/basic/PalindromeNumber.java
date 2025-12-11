package basic;

public class PalindromeNumber {
    public static void main(String[] args){
        int num = 121, sum=0;

        while(num!=0){
            int r = num%10;
            sum = sum*10 + r;
            num = num/10;
        }
        System.out.println(sum);
    }
}

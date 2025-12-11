package basic;

public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 24;
        String binary = " ";

        while(num!=0){
            int r = num% 2;
            binary = binary + r;
            num = num/2;
        }
        System.out.println(binary);
    }
}

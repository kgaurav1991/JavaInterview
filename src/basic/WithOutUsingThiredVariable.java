package basic;

public class WithOutUsingThiredVariable {
    public static void main(String[] args) {
        int a=10, b=20;

         a = (a+b) - (b=a);
         /*
        a=a+b;
        b=a-b;
        a=a-b;
        */
        System.out.println(a+" : "+b);
    }
}

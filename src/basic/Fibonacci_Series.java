package basic;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int n1=0,n2=1,n,num=6;

        System.out.println(n1+" \n "+n2);
        for(int i=0;i<=num;i++){
            n=n1+n2;
            System.out.println(n+" ");
            n1=n2;
            n2=n;
        }
    }
}

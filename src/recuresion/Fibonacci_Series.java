package recuresion;

class Fibonacci{
    public void fibo(int a,int b,int num){
        if(num == 0){
            return;
        }
        System.out.print(a+" ");
        fibo(b,a+b,num-1);
    }
}
public class Fibonacci_Series {
    public static void main(String[] args) {
        int num=6;

        Fibonacci  fibonacci=new Fibonacci();
        fibonacci.fibo(0,1,num);

    }
}

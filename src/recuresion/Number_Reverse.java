package recuresion;

class Number{
    public void number(int n){
        if(n == 0) {
            return;
        }
        System.out.print(n%10);
        number(n/10);
    }
}
public class Number_Reverse {
    public static void main(String args[]){
        int num = 1234;

        Number arr = new Number();
        arr.number(num);
    }
}

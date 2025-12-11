package basic;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 20;

        for (int i = 2; i <= num; i++) {
            boolean isPrime = false;
            for (int j = 2; j < i; j++) { //Math.sqar(i)
                if (i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) {
                System.out.println(i);
            }
        }

    }
}

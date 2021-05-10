import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        calculatePrimeFactors(n);
    }

    public static void calculatePrimeFactors(int n) {
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                System.out.println(i);
            }
        }

        if (n != 1) {
            System.out.println(n);
        }
    }

}

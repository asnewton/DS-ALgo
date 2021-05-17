import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        int result = 0;
        int p = 0;

        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            result += digit * (int) Math.pow(b, p);
            p++;
        }

        return result;
    }
}

import java.util.Scanner;

public class AnyBaseMultiplication extends AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        int result = 0;
        int power = 1;
        while (n2 > 0) {
            int d = n2 % 10;
            n2 = n2 / 10;
            int rv = getSingleDigitProduct(b, n1, d);
            result = getSum(b, result, rv * power);
            power = power * 10;
        }
        return result;
    }

    public static int getSingleDigitProduct(int b, int n1, int n2) {
        int rv = 0;
        int carry = 0;
        int power = 1;
        while (n1 > 0 || carry > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int p = (d1 * n2) + carry;
            carry = p / b;
            int d = p % b;
            rv += d * power;
            power = power * 10;
        }
        return rv;
    }
}

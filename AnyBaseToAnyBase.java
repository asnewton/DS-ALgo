import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int decNum = AnyBaseToDecimalConvertor(n, sourceBase);
        int res = DecimalToAnyBase(decNum, destBase);
        System.out.println(res);
    }

    public static int AnyBaseToDecimalConvertor(int n, int b) {
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

    public static int DecimalToAnyBase(int n, int b) {
        int result = 0;
        int p = 0;
        while (n != 0) {
            int digit = n % b;
            n = n / b;
            result += digit * (int) Math.pow(10, p);
            p++;
        }
        return result;
    }

}

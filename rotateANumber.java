import java.util.*;

class RotateANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int digit = digitCount(n);
        int res = 0;

        k = k % digit;
        if (k < 0) {
            k = digit + k;
        }

        int div = 1;
        int mul = 1;
        for (int i = 1; i <= digit; i++) {
            if (i <= k) {
                div *= 10;
            } else {
                mul *= 10;
            }
        }

        int q = n / div;
        int r = n % div;
        res = r * mul + q;

        System.out.println(res);

    }

    public static int digitCount(int n) {
        int digit = 0;
        while (n != 0) {
            n = n / 10;
            digit++;
        }
        return digit;
    }
}
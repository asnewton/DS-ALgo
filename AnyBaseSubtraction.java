import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2) {
        int result = 0;
        int borrow = 0;
        int power = 0;
        while (n2 > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            d2 = d2 - borrow;
            if (d2 < d1) {
                borrow = 1;
                d2 = d2 + b;
            } else {
                borrow = 0;
            }
            int d = d2 - d1;
            result += d * (int) Math.pow(10, power);
            power++;
        }
        return result;
    }
}

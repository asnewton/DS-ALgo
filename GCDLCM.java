import java.util.*;

public class GCDLCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int gcd = GCD(n1, n2);
        int lcm = (n1 * n2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);

    }

    public static int GCD(int n1, int n2) {
        int rem = 0;
        while (n2 % n1 != 0) {
            rem = n2 % n1;
            n2 = n1;
            n1 = rem;
        }
        return rem;
    }

}
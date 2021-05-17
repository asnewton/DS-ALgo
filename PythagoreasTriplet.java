import java.util.Scanner;

public class PythagoreasTriplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int large = a;
        if (b > large) {
            large = b;
        }
        if (c > large) {
            large = c;
        }

        if (large == a) {
            boolean match = (b * b + c * c) == (a * a);
            System.out.print(match);
        }
        if (large == b) {
            boolean match = (a * a + c * c) == (b * b);
            System.out.print(match);
        }
        if (large == c) {
            boolean match = (a * a + b * b) == (c * c);
            System.out.print(match);
        }

    }
}

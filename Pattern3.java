import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int startSpace = 1;
        int endSpace = 2 * n - 1;
        for (int i = 1; i <= n; i++) {
            int val = 1;
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j <= startSpace || j >= endSpace) {
                    System.out.print(val + "\t");
                } else {
                    System.out.print("\t");
                }
                if (j <= (2 * n - 1) / 2) {
                    val++;
                } else {
                    val--;
                }
            }
            System.out.println();
            startSpace += 1;
            endSpace -= 1;

        }

    }
}

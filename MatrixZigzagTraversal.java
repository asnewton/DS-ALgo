import java.util.Scanner;

public class MatrixZigzagTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        System.out.println("Printing Solution.");
        for (int j = 0; j < m; j++) {
            int temp = n - 1;
            for (int i = 0; i < n; i++) {
                if (j % 2 == 0) {
                    System.out.println(mat[i][j]);
                } else {
                    System.out.println(mat[temp][j]);
                    temp--;
                }
            }
        }

    }
}

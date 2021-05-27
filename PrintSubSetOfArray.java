import java.util.Scanner;

public class PrintSubSetOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] inputArray = new int[n];

        for (int i = 0; i < n; i++) {
            int e = scn.nextInt();
            inputArray[i] = e;
        }

        int limit = (int) Math.pow(2, n); // for loop condition e.g [1,2,3] can have 2^3 subsets.
        for (int i = 0; i < limit; i++) {
            int[] arr = getBinaryArray(i, n);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 0) {
                    System.out.print("_\t");
                } else {
                    System.out.print(inputArray[j] + "\t");
                }
            }
            System.out.println();
        }

        // int[] d = getBinaryArray(3, 3);
        // for (int val : d) {
        // System.out.println(val);
        // }
    }

    public static int[] getBinaryArray(int n, int l) {
        int[] binaryArray = new int[l];
        int idx = l - 1;
        while (n != 0) {
            binaryArray[idx] = n % 2;
            n = n / 2;
            idx--;
        }

        while (idx >= 0) {
            binaryArray[idx] = 0;
            idx--;
        }

        return binaryArray;
    }

}

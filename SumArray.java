import java.util.Scanner;
import java.io.*;

public class SumArray {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }

        int[] sum = new int[n2 > n1 ? n2 : n1];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;

        int carry = 0;
        while (k >= 0) {
            int d = 0;
            if (i >= 0) {
                d += arr1[i];
            }
            if (j >= 0) {
                d += arr2[j];
            }
            carry = d / 10;
            sum[k] = d % 10;
            i--;
            j--;
            k--;
        }

        if (carry != 0) {
            System.out.println(carry);
        }

        for (int val : sum) {
            System.out.println(val);
        }

    }

}

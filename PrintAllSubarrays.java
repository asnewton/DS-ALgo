import java.util.Scanner;

class PrintAllSubarrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] inputArray = new int[n];

        for (int i = 0; i < n; i++) {
            int e = scn.nextInt();
            inputArray[i] = e;
        }

        int[][] allSubArrays;
        for (int i = 0; i < n; i++) {
            int[] subArrays;
            for (int j = 0; j <= i; j++) {
                subArrays[j] = inputArray[j];
            }
            allSubArrays[i] = subArrays;
        }
    }

    public static int[] getSubArrays(int[] arr,int start) {
        int[] subArrays;
        for(int i=0; i<= start; i++) {
            int localA
            for(int j=0; j<= i; j++) {

            }
        }
        return subArrays;
    }

}
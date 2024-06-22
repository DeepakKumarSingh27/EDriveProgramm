package RaghuSir.OneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class Arr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(evenOddCheck(arr)));
    }

    public static int[] evenOddCheck(int[] arr) {
        int ec = 0, oc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                ec++;
            else
                oc++;
        }
        return new int[]{ec,oc};
    }
}

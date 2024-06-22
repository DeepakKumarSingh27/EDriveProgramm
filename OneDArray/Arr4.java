package RaghuSir.OneDArray;

import java.util.Scanner;

public class Arr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array of Array");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

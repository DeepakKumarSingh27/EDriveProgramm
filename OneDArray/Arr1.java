package RaghuSir.OneDArray;

import java.util.Scanner;

public class Arr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size");
       int a = sc.nextInt();
       double arr[] = new double[a];
        System.out.println("Enter "+a+" double value");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Average is "+sum/arr.length);
    }
}

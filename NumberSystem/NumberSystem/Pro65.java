package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println("Decimal to Binary "+decToBin(n));
    }
    public static String decToBin(int n) {
        String dec = " ";
        do {
            int d = n % 2;
            dec = d + dec;
            n /= 2;
        } while (n !=0);
        return dec;
    }
}

package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println("product of digits is " + getProdDigit(n));
    }

    private static int getProdDigit(int n) {
        int prod = 1;
        do {
            int d = n % 10;
            prod *= d;
            n /= 10;
        } while (n != 0);
        return prod;
    }
}


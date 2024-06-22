package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println("Octal to Decimal is " + OctToDec(n));
    }

    public static int OctToDec(int n) {
        int dec = 0,p = 0;
        do {
            int d = n % 10;
            dec = dec + d * (int) Math.pow(8,p);
            p++;
            n /= 10;
        }while (n!= 0);
        return dec;
    }
}
/*
1 0 1 0
1*2^3 +0*2^2 +1*2^1 +0*2^0
8 + 0 + 2 + 0
 */


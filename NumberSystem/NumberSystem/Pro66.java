package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println("Decimal to octal "+decToOct(n));
    }
    public static String decToOct(int n) {
        String Oct = " ";
        do {
            int d = n % 8;
            Oct = d + Oct;
            n /= 8;
        } while (n !=0);
        return Oct;
    }
}

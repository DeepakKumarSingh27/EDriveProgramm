package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        boolean rs = isStrong(n);
        if (rs) System.out.println(n +" is Strong Number");
        else System.out.println(n+" is Not Strong Number");
    }

    private static boolean isStrong(int n) {
        int sum = 0,t = n;
        do {
            int d = n % 10;
            sum += isFact(d);
            n /= 10;
        } while (n != 0);
        return sum == t;
    }
    public static int isFact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        boolean rs = isPerfect(n);
        if (rs) System.out.println(n+" is Perfect Number");
        else System.out.println(n+" is not Perfect Number");
    }

    private static boolean isPerfect(int n) {
        int sum =  0, t = n;
        for (int i = 1; i <= n/2 ; i++) {
            if (n % i == 0)
            sum += i;
        }
        return sum == t;
    }
}

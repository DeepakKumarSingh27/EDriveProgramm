package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            boolean rs = isPrime(i);
            if (rs) sum += i;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}


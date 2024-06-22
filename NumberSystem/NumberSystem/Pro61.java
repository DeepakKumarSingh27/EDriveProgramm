package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        for (int i = 100; i <= 999; i++) {
            boolean rs = isPalindrome(i);
            if (rs) System.out.print(i + " ");
        }
    }

    public static boolean isPalindrome(int n) {
        int rev = 0, temp = n;
        do {
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        } while (n != 0);
        return rev == temp;
    }
}

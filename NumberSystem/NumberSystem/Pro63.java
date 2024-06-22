package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            boolean rs = isSpTwoDigit(i);
            if (rs) System.out.println(i);
        }
    }
    public static boolean isSpTwoDigit(int n) {
        int sum = 0,temp = n,d1 = n % 10,d2 = n / 10;
        sum = d1+d2+d1*d2;
        return sum == temp;
    }
}

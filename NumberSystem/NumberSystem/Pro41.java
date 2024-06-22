package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int ct = 0;
        do {
           int d = n % 10;
           if (d == 0) ct++;
           n /= 10;
        } while (n != 0);
        System.out.println(ct);
    }
}

package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
           boolean rs = Pro53.isArmstrong(i);
           if (rs) System.out.println(i);
        }
    }
}

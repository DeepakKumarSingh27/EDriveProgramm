package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int ct = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i+" ");
        }
    }
}

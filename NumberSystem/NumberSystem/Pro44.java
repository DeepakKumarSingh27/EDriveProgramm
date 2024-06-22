package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;


public class Pro44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println(n+ " factorial is "+ getFact(n));
    }

    private static int getFact(int n) {
        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact *= i;
        }
        return fact;
    }
}

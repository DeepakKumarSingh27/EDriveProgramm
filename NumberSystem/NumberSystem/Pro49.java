package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println(n+ " is "+getDiv(n)+" Diviser  Present ");
    }

    private static int getDiv(int n) {
        int ct = 0;
        for (int i = 1; i <= n ; i++) {
            if (n % i == 0)
                ct++;
        }
        return ct;
    }
}

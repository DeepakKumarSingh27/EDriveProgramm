package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int t = n,sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0)
           sum += i;
        }
        if (sum == t) System.out.println("perfect Number");
        else System.out.println("Not perfect Number");
    }
}

package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int temp = n,sum = 0;
        do {
            int d = n % 10;
            sum += d*d*d;
            n /= 10;
        } while (n != 0);
        if (sum == temp) System.out.println(temp + " armstrong");
        else System.out.println(temp+" is not armstrong");
    }
}

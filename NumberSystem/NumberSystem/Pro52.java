package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println("Enter the Base ");
        int p = sc.nextInt();
        System.out.println(n +" The Power "+ p + " is "+isPower(n,p));
    }

    private static int isPower(int n, int p) {
        int pow = 1;
        while (p > 0) {
            pow *= n;
            p--;
        }
        return pow;
    }
}

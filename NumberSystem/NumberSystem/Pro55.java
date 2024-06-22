package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        String st = isCheck(n);
        System.out.println(st);
    }

    public static String isCheck(int n) {
        int ct = 0,md = 0,t = n;
        do {
            int d = n % 10;
            if (n <= 9 || t == n)
                ct += d;
            else
                md += d;
            n /= 10;
        } while (n != 0);
        if (ct == md) return "Xylom";
        else return "phloem";
    }
}
/*
2 26 6
 */
package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        boolean rs = isDiserium(n);
        if (rs) System.out.println(n+" is Armstrong Number");
        else System.out.println(n+" is Not Armstrong Number");
    }

    public static boolean isDiserium(int n) {
        int sum = 0, temp = n;
        int dc = digitCount(n);
        do {
            int d = n % 10;
            sum += getPower(d,dc);
            dc--;
            n /= 10;
        } while (n != 0);
        return sum == temp;
    }
    public static int digitCount(int n) {
        int count  = 0;
        do {
            count++;
            n /= 10;
        } while (n != 0);
        return count;
    }
    public static int getPower(int n ,int p){
        int pow = 1;
        while (p > 0){
            pow *= n;
            p--;
        }
        return pow;
    }
}

package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println(countDigit(n)+" Digits are Present");
    }

    private static int countDigit(int n) {
//        int ct = 0;
//        do {
//            ct++;
//            n /= 10;
//        } while (n != 0);

//        return ct;
        return (int) (Math.log10(n) + 1);
    }
}

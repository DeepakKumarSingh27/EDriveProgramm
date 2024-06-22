package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        /*
        49-> 4->16  9->81 => 97
         */
        boolean rs = isHappy(n);
        if (rs) System.out.println(n+" is Happy Number");
        else System.out.println(n+" is Not Happy Number");
    }
    public static boolean isHappy(int n) {
        while (n > 9){
            n = getSumDigit(n);
        }
      return n == 1 || n == 7;
    }
    public static int getSumDigit(int n) {
        int sum = 0;
        do {
            int d = n % 10;
            sum += d*d;
            n /= 10;
        } while (n != 0);
        return sum;
    }
}

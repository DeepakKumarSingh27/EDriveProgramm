package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println("sum of first Natural Number is "+getNum(n));
    }

    private static int getNum(int n) {
         int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return sum;
    }
}

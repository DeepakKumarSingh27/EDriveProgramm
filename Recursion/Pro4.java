package RaghuSir.Recursion;

import java.util.Scanner;

public class Pro4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number(1)  and times ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        printNTimes(x,n);
    }
    public static void printNTimes(int x,int n) {
        if (x > n) return;
        System.out.println(" Raj "+x);
        printNTimes(x + 1,n);
    }
}

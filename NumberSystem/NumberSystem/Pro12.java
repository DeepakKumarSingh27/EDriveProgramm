package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Two Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) System.out.println(a+" is Biggest");
        else System.out.println(b+" is Biggest");
    }
}

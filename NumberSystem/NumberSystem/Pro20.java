package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = sc.nextInt();
        if (a >= 10) System.out.println("2Digit Number");
        else System.out.println("Not 2 Digit Number");
    }
}

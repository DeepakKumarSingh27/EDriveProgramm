package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer value");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Biggest Number is "+((a>b)?a:b));
    }
}

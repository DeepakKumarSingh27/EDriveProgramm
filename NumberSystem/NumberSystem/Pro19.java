package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Smallest Number is "+((a<b) && (a<c) ? a : (b<c) ? b : c));
    }
}
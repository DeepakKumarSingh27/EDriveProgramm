package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two double values");
        double d1 = sc.nextDouble();
        double  d2 = sc.nextDouble();
        System.out.println("Add is "+(d1 + d2));
        System.out.println("sub is "+(d1 - d2));
        System.out.println("mult is "+d1 * d2);
        System.out.println("div is "+d1/d2);
    }
}

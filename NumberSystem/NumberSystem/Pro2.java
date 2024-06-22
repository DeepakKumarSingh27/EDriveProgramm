package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radios of circle");
        int r = sc.nextInt();
        System.out.println("Area is "+3.14 * r * r);
        System.out.println("Circumtance of circle is" + 2 * 3.14 * r);
    }
}

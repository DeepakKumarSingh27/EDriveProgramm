package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount Time and Rate");
        int p = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Simple interest is "+p * r * t /100);
    }
}

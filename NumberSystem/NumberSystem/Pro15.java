package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the four subject Number");
        int p = sc.nextInt();
        int c = sc.nextInt();
        int m = sc.nextInt();
        int b = sc.nextInt();
        if (p > 35 && c > 35 && m > 35 && b > 35)
            System.out.println("pass");
        else
            System.out.println("fail");
    }
}

package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four subject marks");
        int p = sc.nextInt();
        int c = sc.nextInt();
        int m = sc.nextInt();
        int b = sc.nextInt();
        if (p < 36 && c < 36 && m < 36 && b < 36) {
            System.out.println("fail");
        } else {
            double per = (p + c + m +b);
            if (per >= 85) System.out.println("dis");
            else if (per >=60) System.out.println("first class");
            else if (per >= 50) System.out.println("second class");
            else System.out.println("fail");
        }
    }
}

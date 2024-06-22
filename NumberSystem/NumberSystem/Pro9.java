package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int t = n,d1 = n % 10,d2 = n / 10;
        int sum = d1 + d2 + (d1 * d2);
        if (t == sum) {
            System.out.println("sp 2 digit num");
        } else {
            System.out.println("not 2 digit sp num");
        }
    }
}

package RaghuSir.Pattern;

import java.util.Scanner;

public class Ptr11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

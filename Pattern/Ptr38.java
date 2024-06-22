package RaghuSir.Pattern;

import java.util.Scanner;

public class Ptr38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int st = n,sp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp - 1; j++) {
                System.out.print(" ");
            }
            int k = sp + 1;
            for (int j = 1; j <= st ; j++) {
                System.out.print(k+" ");
                if (j <= st / 2) {
                    k++;
                } else {
                    k--;
                }
            }
            if (i <= n/2) {
                sp++;
                st -= 2;
            } else {
                sp--;
                st += 2;
            }
            System.out.println();
        }
    }
}

package RaghuSir.Pattern;

import java.util.Scanner;

public class Ptr40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int st = n, sp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            int k = sp + 1;
            for (int j = 1; j <= st; j++) {
                System.out.print(k+" ");
                if (j <=st/2){

                }
            }
        }
    }
}

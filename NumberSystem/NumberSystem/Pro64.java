package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;


public class Pro64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        for (int i = 1; n > 0 ; i++) {
            boolean rs = Pro54.isDiserium(i);
            if (rs) {
                System.out.print(i+" ");
                n--;
            }
        }
    }
}

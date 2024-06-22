package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int m = sc.nextInt();
        if (m >=1 && m <= 12) System.out.println("Valid month Num");
        else System.out.println("Invalid Month Num");
    }

}

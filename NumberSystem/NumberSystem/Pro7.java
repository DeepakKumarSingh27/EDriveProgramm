package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount ");
        int amt = sc.nextInt();
        System.out.println("500 rupees is "+amt/500);
        amt = amt % 500;
        System.out.println("10 Rupees is "+amt/10);
        amt = amt % 10;
    }
}

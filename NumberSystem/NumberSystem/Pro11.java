package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the Number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        if (a == b)
            System.out.println("Number's are equal");
        else
            System.out.println("Number's are not equal");
    }
}

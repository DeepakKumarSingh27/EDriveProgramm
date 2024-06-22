package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum of  first "+ n + " Natural Number is "+sum);
    }
}

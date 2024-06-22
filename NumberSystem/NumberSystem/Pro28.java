package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int esum = 0,osum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                esum += i;
            else
                osum += i;
        }
        System.out.println(esum +" -----> "+osum);
    }
}

package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int ecount = 0, ocount = 0;
        do {
            int d = n % 10;
            if (d % 2 == 0)
                ecount++;
            else
                ocount++;
            n /= 10;
        } while (n != 0);
        System.out.println(ecount+" ----- "+ocount);
    }
}

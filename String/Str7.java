package RaghuSir.String;

import java.util.Scanner;

public class Str7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9')
                sum += ch - '0';
        }
        System.out.println("Sum of digits is "+sum);
    }
}

package RaghuSir.String;

import java.util.Scanner;

public class Str2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word");
        String st = sc.nextLine();
        int cl = 0, sl = 0, dg = 0, sp = 0;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                cl++;
            else if (ch >= 'a' && ch <= 'z')
                sl++;
            else if (ch >= '0' && ch <= '9')
                dg++;
            else
                sp++;
        }
        System.out.println("Capital Letter is " + cl);
        System.out.println("Small Letter is " + sl);
        System.out.println("Digit is " + dg);
        System.out.println("Special character is " + sp);
    }
}

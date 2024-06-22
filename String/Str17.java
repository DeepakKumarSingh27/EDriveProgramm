package RaghuSir.String;

import java.util.Scanner;

public class Str17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = sc.nextLine();
        wordReverseSen(str);
    }
    public static void wordReverseSen(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int k = i;
            String s = "";
            while (k < ch.length && ch[k] != ' ') {
                s = ch[k++] + s;
            }
            System.out.print(s);
            if (k < ch.length) {
                System.out.print(" ");
            }
            i = k;
        }
    }
}

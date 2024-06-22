package RaghuSir.String;

import java.util.Scanner;

public class Str16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = sc.nextLine();
        System.out.println(swapLatter(str));
    }
    public static String swapLatter(String str) {
        int f = 0;
        char[] ch = str.toCharArray();
        for (int i = 1; i < ch.length; i++) {
            if (i == 0 && ch[i] != ' ' && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ')
            {
                f = i;
            }
            else if (i == ch.length - 1 && ch[i] != ' ' || ch[i] != ' ' && ch[i + 1] == ' ')
            {
                char temp = ch[i];
                ch[i] = ch[f];
                ch[f] = temp;
            }
        }
        return new String(ch);
    }
}

package RaghuSir.String;

import java.util.Scanner;

public class Str15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = sc.nextLine();
        System.out.println(lastInitCap(str));
    }
    public static String lastInitCap(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i == ch.length - 1 && ch[i] != ' ' || ch[i] != ' ' && ch[i + 1] == ' ') {
                if (ch[i] >= 'a' && ch[i] <= 'z') ch[i] = (char) (ch[i] - 32);
            } else {
                if (ch[i] >= 'A' && ch[i] <= 'Z') ch[i] = ((char) (ch[i] + 32));
            }
        }
        return new String(ch);
    }
}
/*
Deepak is good boy
deepaK iS gooD boY
 */
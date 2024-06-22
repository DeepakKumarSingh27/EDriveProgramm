package RaghuSir.String;

import java.util.Scanner;

public class Str14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = sc.nextLine();
        int ct = wordCount(str);
        System.out.println("Word present in sentence is " + ct);
    }

    public static int wordCount(String str) {
        int count = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ')
                count++;
        }
        return count;
    }
}

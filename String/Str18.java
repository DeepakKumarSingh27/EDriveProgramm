package RaghuSir.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Str18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence ");
        String str = sc.nextLine();
        sentenceReverse(str);
    }

    public static void sentenceReverse(String str) {
        char[] ch = str.toCharArray();
        List<String> li = new ArrayList<String>();
        for (int i = 0; i < ch.length; i++) {
            int k = i;
            String s = "";
            while (k < ch.length && ch[k] != ' ') {
                s += ch[k++];
            }
            li.add(s);
            i = k;
        }
        for (int i = li.size() - 1; i >= 0; i--) {
            System.out.print(li.get(i));
            if (i > 0)
                System.out.print(" ");
        }
    }
}


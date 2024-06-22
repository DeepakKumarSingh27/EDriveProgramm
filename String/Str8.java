package RaghuSir.String;

import java.util.Scanner;

public class Str8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = sc.nextLine();
        String vow = "AEIOUaeiou";
        int count  = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vow.indexOf(ch) != -1)
                count++;
        }
        System.out.println("vowels are present in string is "+count);
    }
}

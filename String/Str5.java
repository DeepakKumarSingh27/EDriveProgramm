package RaghuSir.String;

import java.util.Scanner;

public class Str5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '1' && ch <= '9') == false)
                count++;
        }
        System.out.println("in word "+str +" special character is "+count);
    }
}

package RaghuSir.String;

import java.util.Scanner;

public class Str4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String st = sc.nextLine();
        boolean rs = isPalindrome(st);
        if (rs) System.out.println(st + " is Palindrome");
        else System.out.println(st + " is Not Palindrome");
    }

    public static boolean isPalindrome(String st) {
        int start = 0, end = st.length() - 1;
        while (start < end) {
            if (st.charAt(start) != st.charAt(end))
                return false;
            start++;
            end--;
        }

        return true;
    }
}
/*
01234
madam ->
1413
 */
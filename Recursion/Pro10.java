package RaghuSir.Recursion;

import java.util.Scanner;

public class Pro10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word!");
        String str = sc.nextLine();
      // boolean rs = isPalindrome(0,str,str.length());
        boolean rs = isPalindrome(str,0,str.length());
        if (rs) System.out.println("String is palindrome");
        else System.out.println("String is Not palindrome");
    }
    public static boolean isPalindrome(int i,String str,int n) {
        if (i >= n/2) return true;
        if (str.charAt(i) != str.charAt(n - i - 1)) return false;
        return isPalindrome(i + 1,str,n);
    }
    public static boolean isPalindrome(String str,int start,int end) {
        if (start <= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str,start + 1,end - 1);
    }
}

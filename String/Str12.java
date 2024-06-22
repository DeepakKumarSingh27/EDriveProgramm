package RaghuSir.String;

import java.util.Scanner;

public class Str12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Two word");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean rs = isAnagram(str1,str2);
        if (rs) System.out.println(str1 +" and "+str2+" are Anagram");
        else System.out.println(str1 +" and "+str2+" are not  Anagram");
    }
    public static boolean isAnagram(String str1,String str2) {
       int[] ch1 = freqCount(str1);
       int[] ch2 = freqCount(str2);
        for (int i = 0; i < 26; i++) {
            if (ch1[i] != ch2[i]) return false;
        }
        return true;
    }
    public static int[] freqCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') count[ch - 65]++;
            else if (ch >= 'a' && ch <= 'z') count[ch - 97]++;
        }
        return count;
    }
}

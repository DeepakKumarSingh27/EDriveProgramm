package RaghuSir.String;

import java.util.HashMap;
import java.util.Scanner;

public class Str6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = sc.nextLine();
        int[] count = new int[128];
        HashMap<Character,Integer> mpp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!mpp.containsKey(ch) )
                mpp.put(ch,1);
            else
                mpp.put(ch,mpp.get(ch)+ 1);
            //mpp.put(ch,i);
            count[ch]++;
        }
        System.out.println(mpp);
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0)
                System.out.println((char) i+" ---> "+count[i]);
        }
    }
}

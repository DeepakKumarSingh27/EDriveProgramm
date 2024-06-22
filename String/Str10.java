package RaghuSir.String;
import java.util.Scanner;
public class Str10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = sc.nextLine();
        String rev = isReverse(str);
        System.out.println("Reverse String is "+rev);
    }
    public static String isReverse(String str) {
        char[] ch = str.toCharArray();
        int i = 0, j=  ch.length - 1;
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}
package RaghuSir.DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class StringIsBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        boolean rs = isBalance(str);
        if (rs == true)
            System.out.println("String is Balance");
        else
            System.out.println("String is not balance");
    }

    public static boolean isBalance(String str) {
        if (str.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(')
                stk.push(ch);
            else {
                if (stk.isEmpty())
                    return false;
                switch (ch) {
                    case '}': if (stk.pop() != '{')
                            return false;
                        break;
                    case ']': if (stk.pop() != '[')
                            return false;
                        break;
                    case ')': if (stk.pop() != '(')
                            return false;
                        break;
                }
            }
        }
        return stk.isEmpty();
    }
}

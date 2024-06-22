package RaghuSir.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Pro25 {
    public static void main(String[] args) {
        System.out.println(get(5,6));
    }
   public static List<Integer> get(int a, int b)
    {
        // code here
        System.out.println(a+" "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a+" " +b);

     List<Integer> ans = new ArrayList<>();
     ans.add(a);
     ans.add(b);
     return ans;
    }
}

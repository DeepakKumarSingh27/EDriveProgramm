package RaghuSir.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Pro23 {
    public static void main(String[] args) {
        System.out.println(addOperators( "123", 6));
    }
    public static List<String> addOperators(String num, int target) {
     List<String> ans = new ArrayList<>();
     solved(0,num,target,"",ans,0,0);
     return ans;
    }

    public static void solved(int index, String num, int target, String curr, List<String> ans, long prev, long res) {
        if (index == num.length()) {
            if (res == target) {
                ans.add(curr);
            }
            return;
        }
         String st = "";
        long currRes = 0;
        for (int i = index; i < num.length(); i++) {
            if (i > index && num.charAt(index)=='0')break;
            st+=num.charAt(i);
            currRes = currRes * 10 +(num.charAt(i)-'0');
            if (index == 0) {
                solved(i+1,num,target,st,ans,currRes,currRes);
            } else {
                solved(i+1,num,target,curr+"+"+st,ans,currRes,res+currRes);
                solved(i+1,num,target,curr+"-"+st,ans,-currRes,res-currRes);
                solved(i+1,num,target,curr+"*"+st,ans,prev*currRes,res-prev+(prev*currRes));
            }
        }
    }
}

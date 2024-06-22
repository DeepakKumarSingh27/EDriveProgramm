package RaghuSir.Recursion;

import java.util.*;

public class Pro22 {
    public static void main(String[] args) {
        List<String>str = new ArrayList<>();
        str.add("Leet");
        str.add("Code");
        System.out.println(wordBreak("LeetCode",str));
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        int[][] dp = new int[s.length()][s.length()];
        for (int[]i:dp) {
            Arrays.fill(i,-1);
        }
    return solved(0,0,s,new HashSet<>(wordDict),dp);
    }
    public static boolean solved(int start, int end, String s, Set<String> wd,int[][] dp) {
       if (dp[start][end] != -1) return dp[start][end] == 1 ? true :false;
        if (end == s.length() - 1) {
           if (wd.contains(s.substring(start,end+1))) return true;
           return false;
       }
       if (wd.contains(s.substring(start,end + 1))) {
           if (solved(end +1,end + 1,s,wd,dp)) {
               dp[start][end] = 1;
               return true;
           }
       }
       dp[start][end] = solved(start,end+1,s,wd,dp) ? 1: 0;
        return dp[start][end] == 1 ? true : false;
    }
}

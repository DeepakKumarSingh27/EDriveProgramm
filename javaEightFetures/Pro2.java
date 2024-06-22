package RaghuSir.javaEightFetures;

import java.util.*;

public class Pro2 {
    public static void main(String[] args) {
//     int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
//        intervals = merge(intervals);
//        for (int[] ints : intervals) {
//            System.out.println(Arrays.toString(ints));
//        }
        // mergeTwoSortedArraysWithoutExtraSpace(new long[]{1, 8, 8}, new long[]{2, 3, 4, 5});
        // Factorial(5);

        //  String[] words = {"This","is","aysysysy","sample","ahah"};
        //StringBuilder sen = new StringBuilder();
//        for (String word : words)
//        {
//            if (word.length() % 2 == 0) {
//                sen.append(word).append(" ");
//            }
//        }
//        if (sen.length() > 0) {
//            sen.deleteCharAt(sen.length() - 1);
//        }
//        for (String word : words){
//            if (evenStringLength(word)){
//                sen.append(word).append(" ");
//            }
//        }
//        if (sen.length() > 0) {
//            sen.setLength(sen.length() - 1);
//        }
//        System.out.println("even sen is");
//        System.out.println(sen);

        // System.out.println(isArmstrong(153));
        //changeString("Deepak");
        // series(5);
        //System.out.println(isPalindrome("madam"));
       // System.out.println(countWords("Deepak kumar singh B.Tech deepak"));
        String word = "Deepak madam kumar singh malayalam";
        int ct = countWords(word);
        System.out.println("word present in sentence is "+ct);
        System.out.println("palindrome words is ");
        findAndPrintPalindrome(word);
    }

    // ReverseArray
    public static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void LeftRotate(int[] arr, int k) {
        int n = arr.length;
        Reverse(arr, 0, k - 1);
        Reverse(arr, k, n - 1);
        Reverse(arr, 0, n - 1);
    }

    public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        Reverse(arr, 0, n - k - 1);
        Reverse(arr, n - k, n - 1);
        Reverse(arr, 0, n - 1);
    }

    // factorial
    public static void Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }

    //even word length
    public static boolean evenStringLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count % 2 == 0;
    }

    public static boolean isArmstrong(int n) {
        int sum = 0, temp = n;
        int ct = countDigit(n);
        do {
            int d = n % 10;
            sum += power(d, ct);
            n /= 10;
        } while (n != 0);
        return sum == temp;
    }

    public static int countDigit(int n) {
        int count = 0;
        do {
            count++;
            n /= 10;
        } while (n != 0);
        return count;
    }

    public static int power(int n, int p) {
        int pow = 1;
        while (p > 0) {
            pow *= n;
            p--;
        }
        return pow;
    }

    // change the small or capital
    public static void changeString(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (ch >= 'A' && ch <= 'Z') {
                charArray[i] = (char) (ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                charArray[i] = (char) (ch - 32);
            }
        }
        System.out.println(new String(charArray));
    }

    // series
    public static void series(int n) {
        int f1 = 0, f2 = 1;
        while (n > 0) {
            System.out.print(f1 + " ");
            int temp = f1 + f2;
            f1 = f2;
            f2 = temp;
            n--;
        }
    }

    // check palindrome and count words
    public static boolean isPalindrome(String word) {
        int start = 0, end = word.length() - 1;
        while (start++ <= end--) {
            if (word.charAt(start) != word.charAt(end)) return false;
        }
        return true;
    }
    public static int countWords(String str) {
        int count  = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length() - 1; i++) {
            if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') count++;
        }
        return count;
    }
  public static void findAndPrintPalindrome(String sen) {
        StringBuilder cw = new StringBuilder();
      for (int i = 0; i < sen.length(); i++) {
          char ch = sen.charAt(i);
          if (Character.isLetter(ch)) {
              cw.append(ch);
          } else {
              if (cw.length() > 0) {
                  String word = cw.toString();
                  if (isPalindrome(word)) {
                      System.out.println(word);
                  }
                  cw.setLength(0);
              }
          }
      }
      if (cw.length() > 0) {
          String word = cw.toString();
          if (isPalindrome(word)) {
              System.out.println(word);
          }
      }
  }
}

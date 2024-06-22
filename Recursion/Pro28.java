package RaghuSir.Recursion;

public class Pro28 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(12));
    }
   public static int sumOfDigits(int n) {
        // code here
       int sum = 0;
       do {
           int d = n % 10;
           sum +=d;
           n /= 10;
       }while (n != 0);
       return sum;
    }
}

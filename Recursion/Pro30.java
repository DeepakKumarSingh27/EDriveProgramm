package RaghuSir.Recursion;

public class Pro30 {

    static int isDisarium(int N) {
        // code here
       boolean rs = isCheck(N);
       if (rs) return 1;
       else return 0;
    }
    public static boolean isCheck(int n) {
        int sum = 0, temp = n;
        int dc = digitCount(n);
        do {
            int d = n % 10;
            sum += getPower(d,dc);
            dc--;
            n /= 10;
        } while (n != 0);
        return sum == temp;
    }
    public static int digitCount(int n) {
        int count  = 0;
        do {
            count++;
            n /= 10;
        } while (n != 0);
        return count;
    }
    public static int getPower(int n ,int p){
        int pow = 1;
        while (p > 0){
            pow *= n;
            p--;
        }
        return pow;
    }
}

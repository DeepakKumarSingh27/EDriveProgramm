package RaghuSir.RevisionDataStructure.Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(new ReverseNumber().digreverse(12345));
        System.out.println(digitReverse(1234567));
    }
    int sum = 0;
    public int digreverse(int n)
    {
        if (n == 0)
        {
            return sum;
        }
        if (n > 0)
        {
            int d = n % 10;
            sum = sum * 10 + d;
            digreverse(n / 10);
        }
        return sum;
    }
    public static int digitReverse(int n){
        return digitReverse(0,n);
    }
    public static int digitReverse(int rev,int n){
        if (n == 0)
            return rev;
        return digitReverse(rev * 10 + n % 10,n / 10);
    }
}

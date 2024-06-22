package RaghuSir.RevisionDataStructure.Recursion;

public class GCD {
    public static void main(String[] args) {
        System.out.println("GCD is "+GCD(2,8)+" "+GCD1(2,8));
    }
    public static int GCD(int a,int b){
        if (a == 0) {
            return b;
        }
        return GCD(b % a,a);
    }
    public static int GCD1(int m,int n){
        if (m > n)
            return GCD1(n,m);
        if (n % m == 0)
            return m;
        return GCD1(n % m,n);
    }
}

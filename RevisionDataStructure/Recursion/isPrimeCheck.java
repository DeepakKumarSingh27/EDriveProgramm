package RaghuSir.RevisionDataStructure.Recursion;

public class isPrimeCheck {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n+" is "+isPrime(n));
    }
    public static boolean isPrime(int n){
        return isPrime(2,n);
    }
    public static boolean isPrime(int i,int n){
        if (n % 2 == 0)
            return false;
        if (i > n / 2)
            return true;
        return isPrime(i + 1,n);
    }
}

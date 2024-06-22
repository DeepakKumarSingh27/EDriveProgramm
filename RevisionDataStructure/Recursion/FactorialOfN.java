package RaghuSir.RevisionDataStructure.Recursion;

public class FactorialOfN {
    public static void main(String[] args) {
        System.out.println("fact is "+isfactorial(5));
    }
    public static int isfactorial(int n){
        if (n == 0)
            return 1;
        return n * isfactorial(n - 1);
    }
}

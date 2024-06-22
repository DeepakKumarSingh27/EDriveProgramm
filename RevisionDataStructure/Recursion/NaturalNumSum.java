package RaghuSir.RevisionDataStructure.Recursion;

public class NaturalNumSum {
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNum(5));
    }
    public static int sumOfNaturalNum(int n){
        if (n == 0)
            return 0;
        return n + sumOfNaturalNum(n - 1);
    }
}

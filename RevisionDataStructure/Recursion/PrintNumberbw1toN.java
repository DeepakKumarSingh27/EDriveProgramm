package RaghuSir.RevisionDataStructure.Recursion;

public class PrintNumberbw1toN {
    public static void main(String[] args) {
        printNumber(5);
        System.out.println();
        printNumber1(6);
    }
    public static void printNumber(int n){
        if (n == 0)
            return;
        System.out.print(n+" ");
        printNumber(n - 1);
    }
    public static void printNumber1(int n){
        if (n == 0)
            return;
        printNumber1(n - 1);
        System.out.print(n+" ");
    }
}

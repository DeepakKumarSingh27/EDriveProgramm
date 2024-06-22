package RaghuSir.Recursion;

public class Pro3 {
    public static void main(String[] args) {
        print(1,10);
    }
    public static void print(int i,int n) {
        if (i >  n) return;
        print(i + 1,n);
        System.out.print(i+" ");
    }
}

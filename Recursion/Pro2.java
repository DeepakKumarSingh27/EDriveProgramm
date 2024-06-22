package RaghuSir.Recursion;
// print 1 to n
public class Pro2 {

    public static void main(String[] args) {
      print(1,10);
    }
    public static void print(int i,int n) {
        if (i  > n) return;
        System.out.print(i+" ");
        print(i + 1,n);
    }
}

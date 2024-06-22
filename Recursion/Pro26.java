package RaghuSir.Recursion;

public class Pro26 {
    public static void main(String[] args) {
        System.out.println(checkKthBit(4,0));
    }
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        int mask = 1 << (k - 1);
        // Check if the k-th bit is set
        return (n & mask) != 0;
    }
}

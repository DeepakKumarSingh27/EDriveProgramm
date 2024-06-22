package RaghuSir.Recursion;

public class Pro33 {
    public static void main(String[] args) {
        System.out.println(setBit(6));
    }
    static int setBit(int N){
        if (N == 0) {
            return 1;
        }

        // Find the rightmost unset bit using bitwise operations
        int mask = 1;
        while ((N & mask) != 0) {
            mask <<= 1; // Left shift the mask
        }

        // Set the rightmost unset bit
        return N | mask;
    }
}

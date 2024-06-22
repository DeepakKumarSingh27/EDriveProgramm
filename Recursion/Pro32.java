package RaghuSir.Recursion;

public class Pro32 {
    public static void main(String[] args) {
        System.out.println(countSetBits(4));
    }

    public static int countSetBits(int n) {
        /*
        210
        100->
        001 = 1
        010 = 1
        011 = 2
        100 = 1
        str = 100;
         */
        int count = 0;

        // Iterate through each number from 1 to N
        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num > 0) {
                // Count the set bits in the current number
                count += num & 1;
                num >>= 1; // Right shift to check the next bit
            }
        }

        return count;
    }

}

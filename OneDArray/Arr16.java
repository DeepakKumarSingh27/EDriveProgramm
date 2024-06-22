package RaghuSir.OneDArray;

import java.util.Scanner;

public class Arr16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element");
        int n = sc.nextInt();
        digitFreq(n);
    }
    public static void digitFreq(int n) {
        int count[] = new int[10];
        do {
            int r = n % 10;
            count[r]++;
            n /= 10;
        }while (n != 0);
        for (int i = 0; i <= 9; i++) {
            if (count[i] != 0)
            System.out.println(i+" ---> "+count[i]);
        }
    }
}

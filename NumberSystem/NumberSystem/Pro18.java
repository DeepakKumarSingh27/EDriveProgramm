package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int y = sc.nextInt();
        if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0)
            System.out.println(y+" is Leap Year");
        else System.out.println(y+" is Not Leap Year");
    }
}

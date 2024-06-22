package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Month Number");
        int m = sc.nextInt();
        switch (m)
        {
            case 1 ->System.out.println("Jan");
            case 2 -> System.out.println("feb");
            case 3-> System.out.println("mar");
            case 4 -> System.out.println("April");
            case 5-> System.out.println("May");
            case 6-> System.out.println("June");
            case 7-> System.out.println("July");
            case 8-> System.out.println("Aug");
            case 9-> System.out.println("Sep");
            case 10-> System.out.println("Oct");
            case 11-> System.out.println("Nov");
            case 12-> System.out.println("Dec");
        }
    }
}

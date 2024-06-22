package RaghuSir.NumberSystem.NumberSystem;

import java.util.Scanner;

public class Pro21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
       int small =  (a<b) && (a<c) ? a : (b<c) ? b : c;
       int big =  (a>b) && (a>c) ? a : (b>c) ? b : c;
     //  int mid = (big + small) / 2;
      //  System.out.println(big+ "----"+small);
       // System.out.println("Middle Value is "+mid);
        System.out.println(a+b+c-(big+small));
    }
}

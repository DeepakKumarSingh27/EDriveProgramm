package RaghuSir.javaEightFetures;


import java.util.HashMap;
import java.util.Scanner;

public class MainTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the login Time(HH:MM:SS am/pm)");
        String login = sc.nextLine();
        System.out.println("Enter the logout Time(HH:MM:SS am/pm)");
         String logout = sc.nextLine();
         Time inTime = Time.getTime(login);
         Time outTime = Time.getTime(logout);
          int seconds1 = inTime.noOfSeconds();
          int seconds2 = outTime.noOfSeconds();

          int seconds = 0;
          seconds = seconds2 - seconds1;
          if (seconds < 0)
              seconds = seconds+24*3600;
        System.out.println(seconds/3600+" hours "+seconds%3600/60+" minute "+seconds%60+" seconds");

    }
}

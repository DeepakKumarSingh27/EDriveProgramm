package RaghuSir.javaEightFetures;
//write a java program to read two times and print  how many seconds between two times.
import java.util.Scanner;

public class TimesProgramm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first times HH:MM:SS");
        String st1 = sc.nextLine();
        System.out.println("Enter second times HH:MM:SS");
        String st2 = sc.nextLine();
        int second1 = convertToSeconds(st1);
        int seconds2 = convertToSeconds(st2);
        int difference = Math.abs(second1 - seconds2);
        System.out.println("Difference between two times is "+difference +" seconds");
    }
    public static int convertToSeconds(String time) {
        String[] st =time.split(":");
        int hours = Integer.parseInt(st[0]);
        int minutes =  Integer.parseInt(st[1]);
        int seconds = Integer.parseInt(st[2]);
        return hours * 3600 + minutes * 60 + seconds;
    }
}

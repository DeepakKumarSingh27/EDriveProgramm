package RaghuSir.javaEightFetures;

public class Time {
    private Integer hours;
    private  Integer minute;
    private  Integer seconds;
    private String ampm;
    public Time(Integer minute, Integer hours, Integer seconds,String ampm) {
        this.minute = minute;
        this.hours = hours;
        this.seconds = seconds;
        this.ampm = ampm;
    }

    public static Time getTime(String time) {
        String[] st = time.split(":");
        int hr = Integer.parseInt(st[0]);
        int mm = Integer.parseInt(st[1]);
        int sec = Integer.parseInt(st[2].split(" ")[0]);
        String ap = st[2].split(" ")[1];
        return new Time(hr, mm, sec,ap);
    }

    public int noOfSeconds() {
        int hr = hours;
        if (ampm.equalsIgnoreCase("am") && hours == 12)
            hr = 0;
        if (ampm.equalsIgnoreCase("pm") && hours != 12)
            hr += 12;
        return hr * 3600 + minute * 60 + seconds;
    }

}

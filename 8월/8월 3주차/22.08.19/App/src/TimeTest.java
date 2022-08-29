class Time {

    private int hour;
    private int minute;
    private int second;;

    public void setHour(int hour) {
        if (hour < 0 || hour > 23)
            return; // 유효성
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

}

public class TimeTest {
    public static void main(String[] args) {

        Time t = new Time();
        t.setHour(21);

        System.out.println(t.getHour());
    }
}

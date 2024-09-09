class Time {
    private int hr, min, sec;

    Time() {
        this.hr = 12;
        this.min = 0;
        this.sec = 0;
    }

    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        normalizeTime();
    }

    Time(int secondsSinceMidnight) {
        setClock(secondsSinceMidnight);
    }

    public void setClock(int secondsSinceMidnight) {
        this.hr = secondsSinceMidnight / 3600;
        this.min = (secondsSinceMidnight % 3600) / 60;
        this.sec = secondsSinceMidnight % 60;
        normalizeTime();
    }

    public void tick() {
        this.sec++;
        normalizeTime();
    }

    public void tickDown() {
        this.sec--;
        normalizeTime();
    }

    private void normalizeTime() {
        if (this.sec >= 60) {
            this.min += this.sec / 60;
            this.sec %= 60;
        }
        if (this.min >= 60) {
            this.hr += this.min / 60;
            this.min %= 60;
        }
        if (this.sec < 0) {
            this.min--;
            this.sec += 60;
        }
        if (this.min < 0) {
            this.hr--;
            this.min += 60;
        }
        if (this.hr >= 24) {
            this.hr %= 24;
        }
        if (this.hr < 0) {
            this.hr += 24;
        }
    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hr, min, sec);
    }
}

public class TimeMain {
    public static void main(String[] args) {
        Time t1 = new Time();
        t1.displayTime();

        Time t2 = new Time(5, 45, 23);
        t2.displayTime();

        Time t3 = new Time(3600);
        t3.displayTime();
        t3.tick();
        t3.displayTime();
        t3.tickDown();
        t3.displayTime();
    }
}
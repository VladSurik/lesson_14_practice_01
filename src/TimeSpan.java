
public class TimeSpan {

    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        if (minutes > 59) {
            throw new IllegalArgumentException("Минут может быть максимум 59");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    public void add(int hours, int minutes) {
        this.hours += hours;
        int tmpMinutes = this.minutes += minutes;
        if (tmpMinutes == 60) {
            this.hours += 1;
            this.minutes = 0;
        } else if (tmpMinutes > 60) {
            this.hours += 1;
            this.minutes = tmpMinutes - 60;
        } else {
            this.minutes = tmpMinutes;
        }
    }

    public void sub(int hours, int minutes) {
        int tmpMinutes = this.hours * 60 + this.minutes;
        int subMinutes = hours * 60 + minutes;
        int diffMinutes = tmpMinutes - subMinutes;
        this.hours = diffMinutes / 60;
        this.minutes = Math.max(diffMinutes - (this.hours * 60), 0);
    }

    public void mult(double times) {
        int tmpMinutes = this.hours * 60 + this.minutes;
        int diffMinutes =  (int) (tmpMinutes / times);
        this.hours = diffMinutes / 60;
        this.minutes = Math.max(diffMinutes - (this.hours * 60), 0);
    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }


}

package optional;
import java.time.LocalTime;
public class Duration {
    private LocalTime duration;

    /**
     * constructor
     * calculate the duration of the visit by subtracting openingTime from closingTime
     * @param openingTime opening time for a location
     * @param closingTime closing time for a location
     */
    public Duration(LocalTime openingTime, LocalTime closingTime) {
        int hours = closingTime.getHour() - openingTime.getHour();
        int minutes = closingTime.getMinute() - openingTime.getMinute();
        int seconds = closingTime.getSecond() - openingTime.getSecond();

        if (seconds < 0) {
            seconds += 60;
            minutes--;
        }
        if (minutes < 0) {
            minutes += 60;
            hours--;
        }

        this.duration = LocalTime.of(hours, minutes, seconds);
    }

    /**
     * setter for duration
     * @param duration
     */
    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    /**
     * getter for duration
     * @return
     */
    public LocalTime getDuration() {
        return duration;
    }
}

package module4.programmingwithclass.simplestclass.t6;

/*
6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.
 */
public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours > 23 || hours < 0) {
            this.hours = 0;
        } else {
            this.hours = hours;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes > 59 || minutes < 0) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds > 60 || seconds < 0) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }

    public void changeHours(int addHours) {
        hours = hours + addHours;
        if (hours >= 24 || hours <= -24) {
            hours = hours % 24;
        }
        if (hours < 0) {
            hours = 24 + hours % 24;
        }
    }

    public void changeMinutes(int addMinutes) {
        minutes = minutes + addMinutes;
        if (minutes >= 60 || minutes <= -60) {
            changeHours(minutes / 60);
            minutes = minutes % 60;
        }
        if (minutes < 0) {
            changeHours(-1);
            minutes = 60 + minutes % 60;
        }
    }

    public void changeSeconds(int addSeconds) {
        seconds = seconds + addSeconds;
        if (seconds >= 60 || seconds <= -60) {
            changeMinutes(seconds / 60);
            seconds = seconds % 60;
        }
        if (seconds < 0) {
            changeMinutes(-1);
            seconds = 60 + seconds % 60;
        }

    }

    public void showTime() {
        System.out.format("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}

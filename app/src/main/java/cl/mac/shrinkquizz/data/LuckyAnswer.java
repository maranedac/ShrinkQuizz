package cl.mac.shrinkquizz.data;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Michael on 11-04-2017.
 */

public class LuckyAnswer {

    private boolean happy, luckyDay;

    public LuckyAnswer(boolean happy) {
        this.happy = happy;
        luckyDay = new LuckyDate().day();
    }

    public boolean isHappy() {
        return happy;
    }

    public boolean isLuckyDay() {
        return luckyDay;
    }

    private class LuckyDate {
        public boolean day() {
            Date today = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd"); //este va a tranformar la fecha en un string


            String auxDay = simpleDateFormat.format(today);
            int day = Integer.parseInt(auxDay);

            if (day % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}

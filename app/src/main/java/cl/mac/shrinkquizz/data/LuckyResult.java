package cl.mac.shrinkquizz.data;

/**
 * Created by Michael on 18-04-2017.
 */

public class LuckyResult extends LuckyAnswer {


    public LuckyResult(boolean happy) {
        super(happy);
    }


    private String processingHappy() {
        if (isHappy()) {
            return "Que bueno mantente positivo";
        } else {
            return "Animate fuerza perro";
        }
    }

    private String processingDay() {
        if (isLuckyDay()) {
            return "es tu dia de suerte";
        } else {
            return "vendran dias mejores";
        }
    }

    public String result(){
        return processingHappy() + processingDay();
    }

}

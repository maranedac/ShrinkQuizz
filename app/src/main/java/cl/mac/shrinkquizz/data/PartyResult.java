package cl.mac.shrinkquizz.data;

/**
 * Created by Michael on 06-04-2017.
 */

public class PartyResult extends PartyAnswer {


    public PartyResult(String answer) {
        super(answer);
    }

    public String score() {
        return processing();
    }

    public String processing() {
        String answer = getAnswer();

        if (answer.contains("5")) {
            return "Eres un bebe";

        } else if (answer.contains("10")) {
            return "Bien campeon";

        } else {
            return "Busca Ayuda";
        }

    }

}

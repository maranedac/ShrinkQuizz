package cl.mac.shrinkquizz.data;

/**
 * Created by Michael on 18-04-2017.
 */

public class MatchResult extends MatchAnswer {

    public MatchResult(int ageUser, int ageLover) {
        super(ageUser, ageLover);
    }


    public String result(){
        return processingUser() + processingLover();
    }

    private String processingUser(){
        if (getAgeUser() - getAgeLover()>0){
            return "Hay un desbalance negativo";
        } else{
            return "Hay un desbalance a tu favor";
        }



    }

    private String processingLover(){
        int sum = getAgeUser() + getAgeLover();
        if (sum % 2 == 0){
            return "Los planetas se alinea con su amor";
        } else {
            return "Las piramides contaran su historia";
        }
    }

}

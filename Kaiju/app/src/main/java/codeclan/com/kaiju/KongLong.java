package codeclan.com.kaiju;

/**
 * Created by yanren on 01/11/2017.
 */

public class KongLong extends Kaiju {

    public KongLong(String name, int healthValue, int attackValue){
        super(name, healthValue,attackValue);
    }

    public String action() {
        return "Fly";
    }

}

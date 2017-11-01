package codeclan.com.kaiju;

/**
 * Created by yanren on 01/11/2017.
 */

public class Plane extends Vehicle implements MonsterKiller {
    private int healthValue;

    public Plane(String type, int healthValue) {
        super(type, healthValue);
    }

    public int getHealthValue(){
        return this.healthValue;
    }

    public void setHealthValue(int value){
        this.healthValue = value;
    }
}

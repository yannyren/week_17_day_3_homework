package codeclan.com.kaiju;

/**
 * Created by yanren on 01/11/2017.
 */

public abstract class Kaiju {
    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName(){
        return this.name;
    }

    public int getHealthValue(){
        return this.healthValue;
    }

    public int getAttackValue(){
        return this.attackValue;
    }

    public String roar() {
        return "Awww";
    }

    public void attack(int damageValue, MonsterKiller monsterKiller) {
        int value = monsterKiller.getHealthValue() - damageValue;
        monsterKiller.setHealthValue(value);
    }

    public abstract String action();


}

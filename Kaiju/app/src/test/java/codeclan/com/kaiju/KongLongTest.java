package codeclan.com.kaiju;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by yanren on 01/11/2017.
 */

public class KongLongTest {

    KongLong kongLong;
    Tank tank;


    @Before
    public void before(){
    this.kongLong = new KongLong("KongLong", 100, 100);
    this.tank = new Tank("small", 100);
    }

    @Test
    public void canGetName() {
        assertEquals("KongLong", this.kongLong.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(100, this.kongLong.getHealthValue());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(100, this.kongLong.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("Awww", this.kongLong.roar());
    }

    @Test
    public void canAttack() {
        kongLong.attack(20,tank);
        assertEquals(80, this.tank.getHealthValue());
    }

    @Test
    public void haveAction() {
        assertEquals("Fly", this.kongLong.action());
    }

}

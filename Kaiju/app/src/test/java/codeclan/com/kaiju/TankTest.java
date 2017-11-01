package codeclan.com.kaiju;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yanren on 01/11/2017.
 */

public class TankTest {
    Tank tank;

    @Before
    public void before() {
        this.tank = new Tank("small", 80);

    }

    @Test
    public void canGetType() {
        assertEquals("small", this.tank.getType());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(80, this.tank.getHealthValue());
    }
}

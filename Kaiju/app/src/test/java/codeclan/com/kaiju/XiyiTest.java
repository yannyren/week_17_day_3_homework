package codeclan.com.kaiju;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yanren on 01/11/2017.
 */

public class XiyiTest {
    Xiyi xiyi;

    @Before
    public void before() {
        this.xiyi = new Xiyi("Xiyi", 100,150);
    }

    @Test
    public void canGetName() {
        assertEquals("Xiyi", this.xiyi.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(100, this.xiyi.getHealthValue());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(150, this.xiyi.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("Awww", this.xiyi.roar());
    }
    @Test
    public void hasAction() {
        assertEquals("Move", this.xiyi.action());
    }

}

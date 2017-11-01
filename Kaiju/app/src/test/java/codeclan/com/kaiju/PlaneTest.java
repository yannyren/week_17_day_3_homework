package codeclan.com.kaiju;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yanren on 01/11/2017.
 */

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        this.plane = new Plane("jet", 100);
    }

    @Test
    public void canGetType() {
        assertEquals("jet", this.plane.getType());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(100, this.plane.getHealthValue());
    }
}

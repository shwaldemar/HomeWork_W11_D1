import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle wb;

    @Before
    public void before() {
        wb = new WaterBottle();
    }

    @Test
    public void canDrink() {
        wb.drink();
        assertEquals(90, wb.getVolume());
    }

    @Test
    public void canEmpty() {
        wb.empty();
        assertEquals(0, wb.getVolume());
    }

    @Test
    public void canFill() {
        wb.fill();
        assertEquals(100, wb.getVolume());
    }

}
import static org.junit.Assert.*;

public class PositionTest {

    @org.junit.Test
    public void chgPos() {
        Position pos1 = new Position(0, 0);
        pos1.chgPos(Position.change.increment, Position.param.x);
        Position pos2 = new Position(0, 3);
        pos2.chgPos(Position.change.decrement, Position.param.y);
        assertEquals(1, pos1.x);
        assertEquals(2, pos2.y);
    }

    @org.junit.Test
    public void isValid() {
        final int size = 5;
        assertTrue((new Position(4, 4)).isValid(size));
        assertFalse((new Position(6, 4)).isValid(size));
    }
}
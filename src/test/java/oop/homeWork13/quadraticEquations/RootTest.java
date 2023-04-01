package oop.homeWork13.quadraticEquations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RootTest {

    @Test
    void isEmpty() {
        Root empty = new Root(Double.NaN, Double.NaN);
        boolean result = empty.isEmpty();

            assertTrue(result);
    }

    @Test
    void getCount() {
        Root NoRoot = new Root(Double.NaN, Double.NaN);
            assertEquals(0, NoRoot.getCount());

        Root oneRoot = new Root(2.0, Double.NaN);
            assertEquals(2.0, oneRoot.getCount());

        Root twoRoot = new Root(3.0, 2.0);
            assertEquals(2.0, twoRoot.getCount());

    }

    @Test
    void testToString() {
        Root noRoot1 = new Root(Double.NaN, Double.NaN);
            assertEquals("Рівняння не має коренів.", noRoot1.toString());

        Root oneRoot1 = new Root(3.0, Double.NaN);
            assertEquals("Рівняння ax^2 + bx + c = 0 має корені: x = 3.0", oneRoot1.toString());

        Root twoRoot1 = new Root(3.0, 2.0);
            assertEquals("Рівняння ax^2 + bx + c = 0 має корені: x1 = 3.0, x2 = 2.0", twoRoot1.toString());

    }

    @Test
    void contains() {
        Root contains = new Root(3.0, 2.0);
        boolean result1 = contains.contains(2.0);

            assertTrue(result1);
    }
}
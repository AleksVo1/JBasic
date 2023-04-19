package oop.homeWork13.quadraticEquations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RootTest {

    @Test
    void testIsEmpty() {
        Root isEmpty = new Root(Double.NaN, Double.NaN);
        boolean result = isEmpty.isEmpty();

            assertTrue(result);
    }

    @Test
    void testGetCount() {
        Root NoRoot = new Root(Double.NaN, Double.NaN);
            assertEquals(0, NoRoot.getCount());

        Root oneRoot = new Root(2.0, Double.NaN);
            assertEquals(2.0, oneRoot.getCount());

        Root twoRoot = new Root(3.0, 2.0);
            assertEquals(2.0, twoRoot.getCount());

    }

    @Test
    void testToStringTwoRoots() {
        Root twoRoot = new Root(3.0, 2.0);

        String expected = "Рівняння ax^2 + bx + c = 0 має корені: x1 = 3.0, x2 = 2.0";

        assertEquals(expected, twoRoot.toString());
    }

    @Test
    void testToStringOneRoot(){
        Root oneRoot = new Root(3.0);

        String expected = "Рівняння ax^2 + bx + c = 0 має корені: x = 3.0";

        assertEquals(expected, oneRoot.toString());
    }

    @Test
    void testToStringNoRoots(){
        Root noRoot = new Root();

        String expected = "Рівняння не має коренів.";

        assertEquals(expected, noRoot.toString());

    }

    @Test
    void testContains() {
        Root contains = new Root(3.0, 2.0);
        boolean result1 = contains.contains(2.0);

            assertTrue(result1);
    }

    @Test
    void testNoRoots(){
        QuadraticEquations quadraticEquations = new QuadraticEquations(1.0, 0, 1.0);

            Root roots = quadraticEquations.getRoots();
                assertTrue(roots.isEmpty());
    }

    @Test
    void testOneRoot(){
        QuadraticEquations quadraticEquations = new QuadraticEquations(1.0, -2.0, 1.0);

            Root roots = quadraticEquations.getRoots();
                assertEquals(2, roots.getCount());
                assertTrue(roots.contains(1.0));
    }

    @Test
    void testTwoRoots(){
        QuadraticEquations quadraticEquations = new QuadraticEquations(1.0, -3.0, 2.0);

            Root roots = quadraticEquations.getRoots();
                assertEquals(2, roots.getCount());
                assertTrue(roots.contains(2));
    }

    @Test
    void testConstructorTwoRoots(){
        Root twoRoot = new Root(1.0, 2.0);
        assertFalse(twoRoot.isEmpty());
        assertEquals(2, twoRoot.getCount());
        assertTrue(twoRoot.contains(1.0));
        assertTrue(twoRoot.contains(2.0));

    }

    @Test
    void  testConstructorOneRoot(){
        Root oneRoot = new Root(3.0);
        assertFalse(oneRoot.isEmpty());
        assertEquals(2, oneRoot.getCount());
        assertTrue(oneRoot.contains(3.0));
    }

    @Test
    void testConstructorNoRoots(){
        Root noRoot = new Root();
        assertTrue(noRoot.isEmpty());
        assertEquals(0, noRoot.getCount());
    }
}
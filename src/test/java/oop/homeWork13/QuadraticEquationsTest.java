package oop.homeWork13;

import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class QuadraticEquationsTest {

    @Test
    void PositiveDiscriminantTest() {
        QuadraticEquations.PositiveDiscriminant twoRoot = new QuadraticEquations.PositiveDiscriminant(1, -5, 6);

            assertEquals(2.0, twoRoot.getX1());
            assertEquals(3.0, twoRoot.getX2());

    }
    @Test
    void ZeroDiscriminantTest() {
        QuadraticEquations.ZeroDiscriminant oneRoot = new QuadraticEquations.ZeroDiscriminant(1, -6);

            assertEquals(3.0, oneRoot.getX());

    }

    @Test
    void ZeroDiscriminantTest2() {
        QuadraticEquations.ZeroDiscriminant oneRoot = new QuadraticEquations.ZeroDiscriminant(1, -6);

        assertNotEquals(5.0, oneRoot.getX());

    }

    @Test
    void NegativeDiscriminantTest(){
        QuadraticEquations.PositiveDiscriminant noRoot = new QuadraticEquations.PositiveDiscriminant(1, 1, 1);

            assertEquals(NaN, noRoot.getX1());
            assertEquals(NaN, noRoot.getX2());

    }



}
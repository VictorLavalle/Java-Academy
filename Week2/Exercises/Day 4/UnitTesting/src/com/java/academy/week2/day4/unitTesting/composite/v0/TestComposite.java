package com.java.academy.week2.day4.unitTesting.composite.v0;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class TestComposite {

    @Test
    void testDouble() {
        double d = 5.0;
        assertEquals(d,5.0);
    }

    @Test
    void testDoubleSum() {
        double d1 = 5.0;
        double d2 = 3.0;
        assertEquals(d1+d2,8.0);
    }

    @Test
    void testConstant1() {
        double d = 9.0;
        Expression e = new Constant(d);
        assertEquals(d,e.getValue());
    }

    @Test
    void testConstant2() {
        Expression e = new Constant(9.5);
        assertEquals(9.5,e.getValue());
    }

    @Test
    void testSum() {
        double d1 = 4.5;
        double d2 = 5.8;

        Expression left = new Constant(d1);
        Expression right = new Constant(d2);

        Expression sum = new Sum(left,right);

        assertEquals(d1+d2,10.3);
        assertEquals(d1+d2,sum.getValue());
    }

    @Test
    void testSubtraction() {
        double d1 = 4.5;
        double d2 = 5.8;

        Expression left = new Constant(d1);
        Expression right = new Constant(d2);

        Expression Subtraction = new Subtraction(left,right);

        assertEquals(d1-d2,Subtraction.getValue());
    }

    @Test
    void testMulti() {
        double d1 = 4.5;
        double d2 = 5.8;

        Expression left = new Constant(d1);
        Expression right = new Constant(d2);

        Expression multi = new Multiplication(left,right);

        assertEquals(d1*d2,multi.getValue());
    }

    @Test
    void testDiv() {
        double d1 = 4.5;
        double d2 = 5.8;

        Expression left = new Constant(d1);
        Expression right = new Constant(d2);

        Expression div = new Divsion(left,right);

        assertEquals(d1/d2,div.getValue());
    }

    @Test
    void testComplexOperation() {
        double d1 = 4;
        double d2 = 6;
        double d3 = 200;
        double d4 = 3;
        double d5 = 83;

        Expression e = new Divsion(
                new Multiplication(
                        new Subtraction(
                                new Constant(d1),
                                new Constant(d2)
                        ),
                        new Constant(d3)
                ),
                new Sum(
                        new Constant(d4),
                        new Constant(d5)
                )
        );

        assertEquals(-4.651162,e.getValue(),0.0001);
    }
}

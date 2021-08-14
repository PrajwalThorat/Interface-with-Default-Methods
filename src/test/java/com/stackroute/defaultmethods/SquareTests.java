package com.stackroute.defaultmethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SquareTests {
    private Square square;
    @BeforeEach
    public void setValues()
    {
        square=new Square("RED");
    }
    @Test
    public void testArea()
    {
        square.setSide(10);
        assertEquals(100,square.getArea());
        assertEquals(100,square.getSide()*square.getSide());
        assertNotNull(square.getArea());
    }
    @Test
    public void givenSideOfSquareIsZero()
    {
        square.setSide(0);
        assertEquals(0.0,square.getArea());
    }

    @Test
    public void testPerimeter()
    {
        square.setSide(10);
        assertEquals(40,square.getPerimeter());
    }

    @Test
    public void TestColor()
    {
        assertEquals("RED",square.getColour());
    }

    @Test
    public void givenColourNotNull()
    {
        assertNotNull(square.getColour());
    }

    @Test
    public void givenColourStringIsEmpty()
    {
        Square color=new Square("");
        assertEquals("",color.getColour());
    }

    @Test
    public void testToStringMethod()
    {
        square.setSide(3);
        assertEquals("Square[colour=RED,side=3]",square.toString());

    }
}
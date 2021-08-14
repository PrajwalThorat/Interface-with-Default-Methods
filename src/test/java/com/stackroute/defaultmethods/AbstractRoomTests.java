package com.stackroute.defaultmethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AbstractRoomTests {

    private Rectangle rectangle;
    private Square square;

    @BeforeEach
    public void setValues()
    {
        rectangle=new Rectangle("RED");
        square=new Square("BLUE");
    }

    @Test
    public void colorTestRectangleSquare()
    {
        String color=rectangle.getColour();
        assertEquals("RED",color);
        color=square.getColour();
        assertEquals("BLUE",color);
    }


    @Test
    public void colorRectangleSquareNotNull()
    {
        String color=rectangle.getColour();
        assertNotNull(color);
        color=square.getColour();
        assertNotNull(color);
    }

    @Test
    public void colorRectangleSquareIfEmpty()
    {
        Rectangle color=new Rectangle("");
        assertEquals("",color.getColour());

    }

}
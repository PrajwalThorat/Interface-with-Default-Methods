package com.stackroute.defaultmethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoomTests {
    private RoomTests roomTests;
    private int area;

    @BeforeEach
    public void setUp()
    {
        roomTests=new RoomTests();

    }

    @Test
    public void testAreaOfRoom()
    {
        assertEquals(150,roomTests.getArea());
    }

    @Test
    public void testPerimeterOfRoom()
    {
        assertEquals(50,roomTests.getPerimeter());
    }

    private float getPerimeter() {
        return 0;
    }

    public int getArea() {
        int area = 0;
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
package com.stackroute.defaultmethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RoomServiceTests {
    private RoomService roomService;

    @Test
    public void createSquareTest() {
        roomService = new RoomService();
        Square sq1 = roomService.createSquare("RED", 15);
        Square sq2 = new Square("RED");
        sq2.setSide(10);
        assertEquals("Square[colour=RED,side=10]", sq2.toString());

    }

    @Test
    public void checkIfSquareColourIsNull() {
        Square square = new Square("BLUE");
        assertNotNull(square);
    }

    @Test
    public void checkIfRectangleColourIsNull() {
        Rectangle rectangle = new Rectangle("RED");
        assertNotNull(rectangle);
    }


    @Test
    public void createRectangleTest() {
        roomService = new RoomService();
        Rectangle rect1 = roomService.createRectangle("RED", 5, 4);
        Rectangle rect2 = new Rectangle("RED");
        rect2.setLength(5);
        rect2.setBreadth(4);
        assertEquals("Rectangle[colour=RED,length=5,breadth=4]", rect2.toString());
    }

    @Test
    public void testCompareAreasWhenAreaOfRectIsGreater() {
        Rectangle rectangle = new Rectangle("RED");
        Square square = new Square("BLUE");
        rectangle.setLength(10);
        rectangle.setBreadth(15);
        square.setSide(10);
        RoomService roomService = new RoomService();
        assertEquals(1, roomService.compareRoomArea(rectangle, square));
        assertNotNull(rectangle);
    }

    @Test
    public void testCompareAreasWhenAreaOfSquareIsGreater() {
        Rectangle rectangle = new Rectangle("RED");
        Square square = new Square("BLUE");
        rectangle.setLength(10);
        rectangle.setBreadth(5);
        square.setSide(10);
        RoomService roomService = new RoomService();
        assertEquals(-1, roomService.compareRoomArea(rectangle, square));
        assertNotNull(rectangle);
    }

    @Test
    public void testCompareAreasWhenAreaOfBothAreSame() {
        Rectangle rectangle = new Rectangle("RED");
        Square square = new Square("BLUE");
        rectangle.setLength(10);
        rectangle.setBreadth(10);
        square.setSide(10);
        RoomService roomService = new RoomService();
        assertEquals(0, roomService.compareRoomArea(rectangle, square));
        assertNotNull(rectangle);
    }
}
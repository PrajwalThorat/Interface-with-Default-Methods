package com.stackroute.defaultmethods;

/*
    RoomService class has methods for creating room objects, comparing room and providing room summary.
 */
public class RoomService {

    private String colour;
    private int side,length,breadth;


    public Square createSquare(String colour,int side)
    {

        Square square=new Square(colour);
        square.setSide(side);
        return square;
    }

    public Rectangle createRectangle(String colour, int length, int breadth)
    {

        Rectangle rectangle=new Rectangle(colour);
        rectangle.setLength(length);
        rectangle.setBreadth(breadth);

        return rectangle;
    }

    public static int compareRoomArea(Room one, Room two)
    {
        if(one.getArea()> two.getArea())
            return 1;
        else if(one.getArea()<two.getArea())
            return -1;
        else
            return 0;

    }


}

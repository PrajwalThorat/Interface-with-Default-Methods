package com.stackroute.defaultmethods;

/*
Rectangle class defines the properties of a Rectangle object and implements the default methods of Room interface
 */
public class Rectangle extends AbstractRoom implements Room {

    private int length;
    private int breadth;



    public Rectangle(String colour) {
        super(colour);
    }



    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length=length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        return length*breadth;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+breadth);
    }

    @Override
    public String toString() {
        return "Rectangle["+"colour=" +getColour()+
                ",length=" + length +
                ",breadth=" + breadth+
                "]";
    }
}



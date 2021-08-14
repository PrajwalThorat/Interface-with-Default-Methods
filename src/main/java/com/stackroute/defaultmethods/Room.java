package com.stackroute.defaultmethods;

/*
    Room Interface defines the default methods to be implemented by all classes of type Room
 */
public interface Room {
    default double getArea(){
        double length=10,breadth=15;
        System.out.println("In area default method");
        return length*breadth;
    }



    default double getPerimeter()
    {
        double length=10,breadth=15;
        System.out.println("In perimeter default method");
        return 2*(length+breadth);
    }


}

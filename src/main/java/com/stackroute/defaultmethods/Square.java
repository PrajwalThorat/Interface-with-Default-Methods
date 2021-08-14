package com.stackroute.defaultmethods;

/*
Square class defines the properties of a Square object and implements the default methods of Room interface
 */
    public class Square extends AbstractRoom implements Room {
        private int side;

        public Square(String colour) {
            super(colour);
        }

        public int getSide() {
            return side;
        }

        public void setSide(int side) {
            this.side = side;
        }

        @Override
        public double getArea() {
            return side * side;
        }

        @Override
        public double getPerimeter() {
            return 4 * side;
        }

        @Override
        public String toString() {
            return "Square[" + "colour=" + super.getColour() +
                    ",side=" + side +
                    ']';
        }
    }

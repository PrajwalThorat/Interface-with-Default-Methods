package com.stackroute.defaultmethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

    public class RectangleTests {
        private Rectangle rectangle;

        @BeforeEach
        public void setValues() {
            rectangle = new Rectangle("RED");
        }

        @Test
        public void testArea() {
            rectangle.setLength(10);
            rectangle.setBreadth(15);
            assertEquals(150, rectangle.getArea());
            assertEquals(150, rectangle.getLength() * rectangle.getBreadth());
            assertEquals("Rectangle[Colour=RED,length=10,breadth=15]", rectangle.toString());
            assertNotNull(rectangle.getArea());
        }

        @Test
        public void givenLengthOfRectangleIsZero() {
            rectangle.setLength(0);
            rectangle.setBreadth(15);
            assertEquals(0.0, rectangle.getLength());

        }

        @Test
        public void givenBreadthOfRectangleIsZero() {
            rectangle.setLength(15);
            rectangle.setBreadth(0);
            assertEquals(0.0, rectangle.getBreadth());

        }


        @Test
        public void testPerimeter() {
            rectangle.setLength(5);
            rectangle.setBreadth(4);
            assertEquals(18, rectangle.getPerimeter());
            assertEquals(18, 2 * (rectangle.getBreadth() + rectangle.getLength()));
            assertEquals("Rectangle[colour=RED,length=5,breadth=4]", rectangle.toString());

        }

        @Test
        public void TestColor() {
            assertEquals("RED", rectangle.getColour());
        }

        @Test
        public void givenColourNotNull() {
            assertNotNull(rectangle.getColour());
        }

        @Test
        public void givenColourStringIsEmpty() {
            Rectangle color = new Rectangle("");
            assertEquals("", color.getColour());
        }
    }



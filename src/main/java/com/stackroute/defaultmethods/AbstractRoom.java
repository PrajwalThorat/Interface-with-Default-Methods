package com.stackroute.defaultmethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/*
    Abstract class AbstractRoom defines the common properties and methods for objects of type Room
 */
    public abstract class AbstractRoom implements Room {
    private String colour;

    public AbstractRoom(String colour) {
        this.colour = colour;
    }


    public String getColour() {
        return colour;
    }
}


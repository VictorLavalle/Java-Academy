package com.java.academy.unit.testing.v0;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class TestSum {

    @Test
    void test() {
        int x = 4;
        int y = 5;
        Sum s = new Sum(x,y);

        assertEquals(x+y,s.execute());
    }

}

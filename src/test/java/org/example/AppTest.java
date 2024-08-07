package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void test1() {
        Assertions.assertEquals(2 + 2, 4);
    }

    @Test
    public void test2() {
        Assertions.assertEquals(2 + 2, 5);
    }
}

package com.github.hcsp.calculation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void test() {
        assertEquals("", Main.concatString("", ""));
        assertEquals("a", Main.concatString("a", null));
        assertEquals("ab", Main.concatString("a", "b"));
        assertEquals("b", Main.concatString(null, "b"));
    }
}

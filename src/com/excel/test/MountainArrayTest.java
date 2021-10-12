package com.excel.test;

import com.excel.MountainArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainArrayTest {

    private final MountainArray arr = new MountainArray();

    @Test
    void addition() {
        assertEquals(-1, arr.run1());
    }

}
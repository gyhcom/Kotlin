package com.gyh.kotlinbasics;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class PrimitiveTypeTest {
    @Test
    @DisplayName("Primitive Type은 stack 메모리에 저장되어서 변경해도 원본 변수에 영향이 없다.")
    public void test() {
        int a = 1;
        int b = 2;

        assertEquals(a, 1);
        assertEquals(b, 2);

        modify(a, b);

        assertEquals(a, 1);
        assertEquals(b, 2);
    }

    private void modify(int a, int b) {
        a = 5;
        b = 10;
    }
}

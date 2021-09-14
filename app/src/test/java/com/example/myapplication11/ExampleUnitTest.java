package com.example.myapplication11;

import static com.example.myapplication11.MainActivity.min;
import static com.example.myapplication11.MainActivity.max;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void test_min1() {
        int[] ar = {1, 2, 3, 4, 5};
        int result = min(ar);
        assertEquals(1, result);
    }

    @Test
    public void test_min2() {
        int[] ar = {0, 0, 0, 0, 0};
        int result = min(ar);
        assertEquals(0, result);
    }

    @Test
    public void test_min3() {
        int[] ar = {0, -1, 5, 3, 6, 3};
        int result = min(ar);
        assertEquals(-1, result);
    }

    @Test
    public void test_min4() {
        int[] ar = {-1, -2, -3, -4, -5};
        int result = min(ar);
        assertEquals(-5, result);
    }

    @Test
    public void test_max1() {
        int[] ar = {1, 2, 3, 4, 5};
        int result = max(ar);
        assertEquals(5, result);
    }

    @Test
    public void test_max2() {
        int[] ar = {0, 0, 0, 0, 0};
        int result = max(ar);
        assertEquals(0, result);
    }

    @Test
    public void test_max3() {
        int[] ar = {0, -1, -5, -4, -6};
        int result = max(ar);
        assertEquals(0, result);
    }

    @Test
    public void test_max4() {
        int[] ar = {-1, -2, -3, -4, -5};
        int result = max(ar);
        assertEquals(-1, result);
    }
}
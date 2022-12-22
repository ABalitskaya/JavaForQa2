package HW2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTest {
    @Test
    public void test1() {
        int[] array = {1,2,3,4,5};
        boolean expectedResult = true;
        assertTrue("true", Array.findInArray(array, 15));
    }

    @Test
    public void test2() {
        int[] array = {0,0,0,0,0,1};
        boolean expectedResult = true;
        assertFalse("true", Array.findInArray(array, 7));
    }

    @Test
    public void test3() {
        int[] array = {7,7,1,2,3,7,9,100};
        boolean expectedResult = true;
        assertTrue("true", Array.findInArray(array, 49));
    }

    @Test
    public void test4() {
        int[] array = {1,1,7,4,5,2,9,9,2,1,4,4,199};
        boolean expectedResult = true;
        assertTrue("true", Array.findInArray(array, 1));
    }

    @Test
    public void test5() {
        int[] array = {5,5,4,3,2,1,6,8,6,5,4};
        boolean expectedResult = true;
        assertFalse("true", Array.findInArray(array, 100));
    }
}
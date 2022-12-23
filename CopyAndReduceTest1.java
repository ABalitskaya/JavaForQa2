package HW3;

import Dec16.Delete;
import org.junit.Test;

import static org.junit.Assert.*;

public class CopyAndReduceTest1 {
    @Test
    public void copyAndCreateNewArray() {
        int[] actualArray = {1,3,5,7,3,8,0,8,10};
        int[] expectResult = {1,3,5,7,3,8};
        assertArrayEquals(expectResult, CopyAndReduce.copyAndReduceArray(actualArray, 6));
    }

    @Test
    public void copyAndCreateNewArrayTest2() {
        int[] actualArray = {0,0,0,0,0,10,13};
        int[] expectResult = {0,0};
        assertArrayEquals(expectResult, CopyAndReduce.copyAndReduceArray(actualArray, 2));
    }

    @Test
    // Упал (метод не работает на увеличение длины массива)
    public void copyAndCreateNewArrayTest3() {
        int[] actualArray = {1,2,3,4,5};
        int[] expectResult = {1,2,3,4,5,0,0};
        assertArrayEquals(expectResult, CopyAndReduce.copyAndReduceArray(actualArray, 7));
    }

    @Test
    public void copyAndCreateNewArrayTest4() {
        int[] actualArray = {1,2,3,4,5};
        int[] expectResult = {1,2,3,4,5};
        assertArrayEquals(expectResult, CopyAndReduce.copyAndReduceArray(actualArray, 5));
    }

    @Test
    public void copyAndCreateNewArrayTest5() {
        int[] actualArray = {1,2,3,4,5};
        int[] expectResult = {1,2,3,4,5};
        assertNotEquals(expectResult, CopyAndReduce.copyAndReduceArray(actualArray, 4));
    }

    @Test
    public void copyAndCreateNewArrayTest6() {
        int[] actualArray = {1,2,3,4,5};
        int[] expectResult = {1};
        assertNotEquals(expectResult, CopyAndReduce.copyAndReduceArray(actualArray, 0));
    }


}
package HW3;

public class CopyAndReduce {


    public static int[] copyAndReduceArray(int[] array1, int newLength) {
// Работает только на сокращение массива
        int[] array2 = new int[newLength];

        for (int i = 0; i < array2.length; i++)
            for (int j = 0; j < array1.length; j++) {
                array2[i] = array1[i];
                break;
            }


        //array2.length = array1.length - count;
        return array2;
    }
}

package HW2;

public class Array {
    public static boolean findInArray (int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] * array[j] == number) {
                    return true;
                }

            }

        } return false;
    }
}

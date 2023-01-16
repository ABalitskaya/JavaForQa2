package HW4;

public class hw4DemArray {
    public static void main(String[] args) {


        // Заполнить массив квадратом из # (10x10)
        char[][] array = new char[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][array.length - 1] = '#';
                array[i][0] = '#';
                array[0][j] = '#';
                array[array.length - 1][j] = '#';

            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }

        }
        System.out.println(" ");
        System.out.println("___________________________");

        //Создать многомерный массив 10 x 10. Заполнить его  числами jn 0 до 100  и вывести в консоль таким образом, как это указанно ниже.
        int[][] array1 = new int[10][10];
        int number = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = number;
                number++;

            }

        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println();
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }

        }
        System.out.println(" ");
        System.out.println("___________________________");

        int[][] arrayForCheck = new int[5][5];
        arrayForCheck[0] = new int[] {2, 3, 5, 10, 11};
        arrayForCheck[1] = new int[] {3, 2, 4, 6, 9};
        arrayForCheck[2] = new int[] {5, 4, 2, 7, 12};
        arrayForCheck[3] = new int[] {10, 6, 7, 2, 8};
        arrayForCheck[4] = new int[] {11, 9, 12, 8, 2};

        int[][] arrayForCheck2 = new int[5][5];
        arrayForCheck2[0] = new int[] {2, 3, 5, 10, 222};
        arrayForCheck2[1] = new int[] {3, 2, 4,  6, 9};
        arrayForCheck2[2] = new int[] {5, 4, 2,  7, 12};
        arrayForCheck2[3] = new int[] {10, 6, 7, 2,  8};
        arrayForCheck2[4] = new int[] {11, 9, 12, 8, 2};

        for (int i = 0; i < arrayForCheck.length; i++) {
            System.out.println();
            for (int j = 0; j < arrayForCheck[i].length; j++) {
                System.out.print(arrayForCheck[i][j] + " ");
            }
        }
        System.out.println("Симметричен ли массив 1?" + checkArray(arrayForCheck));
        for (int i = 0; i < arrayForCheck2.length; i++) {
            System.out.println();
            for (int j = 0; j < arrayForCheck2[i].length; j++) {
                System.out.print(arrayForCheck2[i][j] + " ");
            }

        }
        System.out.println("Симметричен ли массив 2?" + checkArray(arrayForCheck2));
    }

    //Task3: Проверьте, является ли двумерный массив симметричным относительно главной диагонали. Главная диагональ — та, которая идёт из левого верхнего угла двумерного массива в правый нижний.


    public static boolean checkArray(int[][] array) {
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != array[j][i]) {
                    flag = false;
                    return flag;
                }
                }
            } return flag;
        }

    }



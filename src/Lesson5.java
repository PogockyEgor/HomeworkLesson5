import java.util.Arrays;
import java.util.Random;

public class Lesson5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array_1 = new int[3][3];
        for (int i = 0; i < array_1.length; i++) {
            for (int j = 0; j < array_1[i].length; j++) {
                array_1[i][j] = random.nextInt(-100, 100);
                System.out.print(array_1[i][j] + "  ");
            }
            System.out.println();
        }
        int max = array_1[0][0];
        int i1 = 0;
        int j1 = 0;
        for (int i = 0; i < array_1.length; i++) {
            for (int j = 0; j < array_1[i].length; j++) {
                if (array_1[i][j] >= max) {
                    max = array_1[i][j];
                    i1 = i;
                    j1 = j;
                }
            }
        }
        array_1[i1][j1] = 777;
        System.out.println("Индексы наибольшего значения массива "+i1 + ", " + j1);
        System.out.println(Arrays.deepToString(array_1));
        System.out.println();
        System.out.println("Наибольший элемент массива "+max);
        int sum = 0;
        for (int i = 0; i < array_1.length; i++) {
            for (int j = 0; j < array_1[i].length; j++) {
                if (i == j) {
                    sum = sum + array_1[i][j];
                }
            }
        }
        System.out.println("Сумма элементов главной диагонали матрицы "+sum);
        int sum2 = 0;
        int sumIndex = array_1.length - 1;
        for (int i = 0; i < array_1.length; i++) {
            for (int j = 0; j < array_1[i].length; j++) {
                if ((i + j) == sumIndex) {
                    sum2 = sum2 + array_1[i][j];
                }
            }
        }
        System.out.println("Побочная диагональ " + sum2);
        int value = 0;
        int[][][] array_2 = {{{1}, {6, 9}, {4, 6, 11}}, {{87}, {32}, {53, 47}, {23, 56}, {12}}, {{7, 9}, {45, 65}, {76}}};
        for (int i = 0; i < array_1.length; i++) {
            for (int j = 0; j < array_2[i].length; j++) {
                for (int k = 0; k < array_2[i][j].length; k++) {
                    value++;
                }
            }
        }
        System.out.println("Сумма всех ячеек зубчатого массива "+value);

        int arr[] = {5,3,1,2,9,6,4,8};
        int summ = 0;
        for (int i =0; i<arr.length; i++){
            summ = summ +arr[i];
        }
        int incr = 0;
        for (int i = 0; i<=arr.length+1; i++){
            incr = incr+i;
        }
        System.out.println(incr-summ);
    }
}
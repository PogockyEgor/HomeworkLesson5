import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(-100, 100);
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] + scanner.nextInt();
                sum = sum + array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Сумма всех элементов массива " + sum);

        String[][] strArray = new String[8][8];
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    strArray[i][j] = "W";
                } else {
                    strArray[i][j] = "B";
                }
                System.out.print(strArray[i][j] + "  ");
            }
            System.out.println();
        }

        int n;
        System.out.println("Введите натуральное целое число больше 3-ех:");
        n = scanner.nextInt();
        for (; ; ) {
            if (n > 3) {
                break;
            } else {
                System.out.println("Пожалуйста, повторите ввод");
                n = scanner.nextInt();
            }
        }
        int[] arr = new int[n];
        int valueEven = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, n+1);
            if (arr[i] % 2 == 0) {
                valueEven++;
            }
        }
        System.out.println(Arrays.toString(arr));
        if (valueEven > 0) {
            int j = 0;
            int[] evenArr = new int[valueEven];
            for (int k : arr) {
                if (k % 2 == 0) {
                    evenArr[j] = k;
                    j++;
                }
            }
            System.out.println(Arrays.toString(evenArr));
        }
    }
}

package task1;

import java.time.Instant;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        int[][] mas = main.getRandomIntArray(10);

        for (int[] num : mas) {
            System.out.println(Arrays.toString(num));
        }

        System.out.println(main.getMaxValue(mas));
        System.out.println(main.getMinValue(mas));
        System.out.println(main.getAvgValue(mas));
    }

    private int getMaxValue(int[][] numbers) {
        int max = numbers[0][0];
        for (int[] number : numbers) {
            for (int i : number) {
                if (i > max) {
                    max = i;
                }
            }
        }
        return max;
    }

    private int getMinValue(int[][] numbers) {
        int min = numbers[0][0];
        for (int[] number : numbers) {
            for (int i : number) {
                if (i < min) {
                    min = i;
                }
            }
        }
        return min;
    }

    private double getAvgValue(int[][] numbers) {
        int sum = 0;
        int count = 0;
        for (int[] nums : numbers) {
            count += nums.length;
            for (int x : nums)
                sum += x;
        }
        return sum * 1.0 / count;
    }

    private int[][] getRandomIntArray(int length) {
        int[][] mas = new int[length][length];
        int startNumber = (int) (Instant.now().toEpochMilli() % 7);
        for (int j = 0; j < mas.length; j++) {
            for (int i = 0; i < mas[j].length; i++) {
                mas[j][i] = (startNumber + i + j) % 97;
                startNumber = mas[j][i];
            }
        }
        return mas;
    }
}

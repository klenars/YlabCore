package task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        int[] mas = {5, 6, 3, 2, 5, 1, 4, 9};

        System.out.println(Arrays.toString(main.getSortedArray(mas)));
    }

    private int[] getSortedArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        return numbers;
    }
}

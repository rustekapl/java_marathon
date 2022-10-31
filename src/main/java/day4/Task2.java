package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int zeroEnd = 0;
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
            if (i % 10 == 0) {
                zeroEnd++;
                sum += i;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + zeroEnd);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);


    }
}

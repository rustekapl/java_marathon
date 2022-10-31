package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];

        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = (int) (Math.random() * 50);
            }
        }
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum > max) {
                max = sum;
                index = i;
            }
        }

        System.out.println(index);

    }
}

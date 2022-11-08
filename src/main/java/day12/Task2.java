package day12;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        fill(0, 30, numbers);
        fill(300, 350, numbers);

        System.out.println(numbers);


    }

    public static void fill(int min, int max, ArrayList<Integer> numbers) {
        for (int i = min; i < max; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }
    }
}

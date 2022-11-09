package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        fill(0, 30, numbers);
        fill(300, 350, numbers);

        System.out.println(numbers);


    }

    public static void fill(int min, int max, List<Integer> numbers) {
        for (int i = min; i < max; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }
    }
}

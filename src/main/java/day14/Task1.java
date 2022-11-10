package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        Scanner scanner = null;
        int sum = 0;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");

        if (numbersString.length != 10) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Некорректный входной файл");
            }
        } else {
            int counter = 0;
            int[] numbers = new int[10];
            for (String number : numbersString) {
                numbers[counter++] = Integer.parseInt(number);

            }
            for (int i = 0; i < 10; i++) {
                sum += numbers[i];
            }
        }
        scanner.close();

        System.out.println(sum);
    }
}

package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        printResult(file2);

        try {
            PrintWriter pw1 = new PrintWriter(file1);
            Random random = new Random();


            for (int i = 0; i < 1000; i++) {
                pw1.print(random.nextInt(100) + " ");
            }
            pw1.close();

            PrintWriter pw2 = new PrintWriter(file2);

            Scanner scanner = new Scanner(file1);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int sum = 0;
            for (int i = 1; i <= 1000; i++) {

                if (i % 20 != 0) {
                    sum += Double.parseDouble(numbers[i]);
                } else {
                    double average = sum / 20d;
                    pw2.print(average + " ");
                    sum = 0;
                }

            }
            pw2.close();


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void printResult(File file) {
        double sum = 0;
        try {
            Scanner scanner1 = new Scanner(file);


            String line = scanner1.nextLine();
            String[] numbers = line.split(" ");
            for (int i = 0; i < numbers.length; i++) {
                sum += Double.parseDouble(numbers[i]);
            }


            System.out.println((int) sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        printResult(new File("D:\\JAVA\\Java_Project\\JavaMarathon2021\\test.txt"));


    }

    public static void printResult(File file) {
        int sum = 0;

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            for (String number : numbers) {
                sum += Integer.parseInt(number);
            }
            double average = sum / (double) numbers.length;
            System.out.printf(average + " --> %.3f", average);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}


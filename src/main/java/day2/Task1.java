package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Ошибка ввода");
        } else if (num < 5) {
            System.out.println("Малоэтажный дом");
        } else if (num < 9) {
            System.out.println("Среднеэтажный дом");
        } else {
            System.out.println("Многоэтажный дом");
        }


    }
}

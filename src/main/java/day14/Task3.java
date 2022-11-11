package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println("[" + parseFileToObjList(file) + "]");

    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> persons = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] personData = line.split(" ");
                String name = personData[0];
                int year = Integer.parseInt(personData[1]);
                if (year < 0) {
                    throw new IOException();
                } else {
                    persons.add(new Person(name, year));
                }

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }

        return persons;
    }

}

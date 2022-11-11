package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File source = new File("src/main/resources/shoes.csv");
        File dest = new File("src/main/resources/missing_shoes.txt");

        try {
            Scanner scanner = new Scanner(source);
            PrintWriter pw = new PrintWriter(dest);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoe = line.split(";");

                if (Integer.parseInt(shoe[2]) == 0) {
                    pw.println(shoe[0] + ", " + shoe[1] + ", " + shoe[2]);
                }

            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }
}

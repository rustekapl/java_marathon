package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {

    private static String key;
    private static Map<String, Integer> words = new HashMap<>();

    public static void main(String[] args) {


        File file = new File("D:\\JAVA\\Java_Project\\JavaMarathon2021\\src\\main\\resources\\dushi.txt");

        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");

            while (scanner.hasNext()) {
                key = scanner.next();
                if (words.containsKey(key)) {
                    words.put(key, (words.get(key) + 1));
                } else {
                    words.put(key, 1);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        System.out.println("Чичиков - " + words.get("Чичиков"));
        words.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(100)
                .forEach(System.out::println);

    }
}

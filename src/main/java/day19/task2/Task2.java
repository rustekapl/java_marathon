package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    private static HashMap<Integer, Point> cars = new HashMap<>();
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File("D:\\JAVA\\Java_Project\\JavaMarathon2021\\src\\main\\resources\\taxi_cars.txt"));
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] car = line.split(" ");
                Integer id = Integer.parseInt(car[0]);
                int x = Integer.parseInt(car[1]);
                int y = Integer.parseInt(car[2]);
                cars.put(Integer.parseInt(car[0]),new Point(x,y));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates (X,Y) of first point");
        String str1 = scanner.nextLine();
        String[] coordinates1 = str1.split(" ");
        int x1 = Integer.parseInt(coordinates1[0]);
        int y1 = Integer.parseInt(coordinates1[1]);

        System.out.println("Enter coordinates (X,Y) of second point");
        String str2 = scanner.nextLine();
        String[] coordinates2 = str2.split(" ");
        int x2 = Integer.parseInt(coordinates2[0]);
        int y2 = Integer.parseInt(coordinates2[1]);

        scanner.close();

        for (Map.Entry<Integer,Point> entry : cars.entrySet()){
            int count = 0;
            if(entry.getValue().getX()>x1 && entry.getValue().getX() < x2
                    && entry.getValue().getY() < y1 && entry.getValue().getY() > y2){
                count++;
                System.out.println(entry.getKey());
                System.out.println("Total cars = " + count);
            }
        }


    }
}


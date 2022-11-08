package day12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("Toyota");
        cars.add("Lada");
        cars.add("Tesla");

        cars.add(3, "Bugatti");

        cars.remove(0);

        System.out.println(cars);

    }
}
